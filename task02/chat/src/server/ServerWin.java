package server;

import com.sun.corba.se.pept.transport.ListenerThread;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import until.DateUntil;

public class ServerWin extends JFrame implements ActionListener, WindowListener {
  private JLabel  statusLab;
  private JTextArea textArea;
  private JTextArea infoTextArea;
  private JScrollPane scrollPane;
  private JTextField textField;
  private JButton sendBtn;

  private ServerSocket serverSocket;
  private Socket socket;
  private InputStream inputStream;
  private OutputStream outputStream;

  // 初始化窗口方法
  public ServerWin(){
    init();
  }

  private void init(){
    // 设置窗口的大小
    this.setSize(940,775);
    // 获得屏幕的大小
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension size = this.getSize();
    // 设置窗口的位置
    this.setLocation((int)(screenSize.getWidth()-size.getWidth())/2,(int)(screenSize.getHeight()-size.getHeight())/2);
    // 设置窗口的标题
    this.setTitle("服务端聊天窗口");
    // 默认当关闭窗口是，销毁对象
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // 设置窗口大小是否可以由用户自己调节
    this.setResizable(false);
    this.setLayout(null);

    Container contentPane = this.getContentPane();
    contentPane.setBackground(Color.white);

    // 状态栏
    statusLab = new JLabel("等待连接");
    statusLab.setBackground(Color.cyan);
    statusLab.setBounds(0,0,890,50);
    statusLab.setForeground(Color.red);
    statusLab.setFont(new Font("微软雅黑",Font.ITALIC,20));
    statusLab.setVerticalTextPosition(JLabel.CENTER);
    contentPane.add(statusLab);

    // 聊天记录框
    textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setBackground(Color.cyan);
    textArea.setFont(new Font("微软雅黑",Font.ITALIC,18));
    scrollPane = new JScrollPane(textArea);
    scrollPane.setBounds(0,50,770,560);
    contentPane.add(scrollPane);

    // 好友资料框
    infoTextArea = new JTextArea();
    infoTextArea.setBounds(770,50,160,725);
    infoTextArea.setFont(new Font("微软雅黑",Font.ITALIC,20));
    infoTextArea.setBackground(Color.white);
    infoTextArea.setText("这里是好友资料");
    contentPane.add(infoTextArea);

    // 消息编写框
    textField = new JTextField();
    textField.setBounds(0,630,770,45);
    textField.setFont(new Font("微软雅黑",Font.ITALIC,20));
    contentPane.add(textField);

    // 发送按钮
    sendBtn = new JButton("发送");
    sendBtn.setBounds(700,690,70,30);
    contentPane.add(sendBtn);

    // 监听发送按钮
    sendBtn.addActionListener(this::actionPerformed);

    new listenThread().start();
    addWindowListener(this);
}

  @Override
  public void windowOpened(WindowEvent e) {

  }

  @Override
  public void windowClosing(WindowEvent e) {
    try {
      if (outputStream != null) {
        outputStream.close();
      }
      if(inputStream != null){
        inputStream.close();
      }
      if(socket != null){
        socket.close();
      }
      if(serverSocket != null){
        serverSocket.close();
      }
    } catch (IOException e1) {
      e1.printStackTrace();
    }
  }

  @Override
  public void windowClosed(WindowEvent e) {

  }

  @Override
  public void windowIconified(WindowEvent e) {

  }

  @Override
  public void windowDeiconified(WindowEvent e) {

  }

  @Override
  public void windowActivated(WindowEvent e) {

  }

  @Override
  public void windowDeactivated(WindowEvent e) {

  }
/*
内部类 线程
 */

public class listenThread extends  Thread{

  public void run(){
    try {
      // 新建服务器
      serverSocket = new ServerSocket(8080,5);
      // 等待连接，并创建Socket对象
      socket = serverSocket.accept();
      inputStream =socket.getInputStream();
      outputStream = socket.getOutputStream();

      statusLab.setText("已经连接");
      statusLab.setForeground(Color.green);
      while(true){
        // 定义临时缓冲区
        byte[] buf = new byte[1024];
        // 从输入流读取字节长度
        int len = inputStream.read(buf);
        // 根据实际长度，定义一个输出缓冲区
        byte[] outBuf = new byte[len];
        // 拷贝数据 临时缓冲区->输出缓冲区
        System.arraycopy(buf,0,outBuf,0,len);
        // 字节到字符
        String getText = new String(outBuf);
        // 显示文本

       textArea.append(DateUntil.getNow()+" 敌方压缩:");
       textArea.append(getText);
       textArea.append("\r\n");

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

public static void main(String[] args){
    ServerWin sw = new ServerWin();
    sw.setVisible(true);
}


// 按钮的监听方法
  @Override
  public void actionPerformed(ActionEvent e) {
    // 执行发送的操作
    if(e.getSource()==sendBtn){
      // 获得发送的文字
      String serverSendText = textField.getText();
      // 处理文本
      if(!"".equals(serverSendText)){
        // 将文字放到聊天框
        textArea.append(DateUntil.getNow()+" 我方压缩:");
        textArea.append(serverSendText);
        textArea.append("\r\n");
        textField.setText("");
        // 发送消息
        byte[] sendBuf = serverSendText.getBytes();
        // 文字到输出流
        try {
          if(outputStream != null){
            outputStream.write(sendBuf);
          }
        } catch (IOException e1) {
          e1.printStackTrace();
        }
      }
    }
  }
}
