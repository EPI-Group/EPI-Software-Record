package client;


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
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import until.DateUntil;

public class ClientWin extends JFrame implements ActionListener, WindowListener {
  private JLabel statusLab;
  private JTextArea textArea;
  private JTextArea infoTextArea;
  private JScrollPane scrollPane;
  private JTextField textField;
  private JButton sendBtn;

  private Socket socket;
  private InputStream inputStream;
  private OutputStream outputStream;

  public ClientWin(){
    init();
  }

  private void init(){
    // 设置窗口的大小
    this.setSize(940,775);
    this.setForeground(Color.cyan);

    // 获得屏幕的大小
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension size = this.getSize();
    // 设置窗口的位置
    this.setLocation((int)(screenSize.getWidth()-size.getWidth())/2,(int)(screenSize.getHeight()-size.getHeight())/2);
    // 设置窗口的标题
    this.setTitle("客户端聊天窗口");
    // 默认当关闭窗口是，销毁对象
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // 设置窗口大小是否可以由用户自己调节
    this.setResizable(false);
    this.setLayout(null);


    Container contentPane = this.getContentPane();
    contentPane.setBackground(Color.white);

    // 状态栏
    statusLab = new JLabel("等待连接");
    statusLab.setBounds(0,0,890,50);
    statusLab.setForeground(Color.red);
    statusLab.setBackground(Color.cyan);
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

    sendBtn.addActionListener(this);
    // 添加窗口监听器
    addWindowListener(this);


  }

  @Override
  public void windowOpened(WindowEvent e) {
    // 窗口打开执行连接的操作（连接服务端的操作)
    socket = null;
    try {
      socket = new Socket("localhost",8080);
      inputStream = socket.getInputStream();
      outputStream = socket.getOutputStream();
      new ListenThread().start();
      // 启动监听消息的线程
      statusLab.setText("已经连接");
      statusLab.setForeground(Color.green);
    } catch (IOException e1) {
      e1.printStackTrace();
    }
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

  public class ListenThread extends Thread{

    public void run(){
      while(true){
        // 连接的状态下
        if(socket.isConnected()){
           byte[] getBuf = new byte[1024];
           // 读取字节长度
          int len = 0;
          try {
            len = inputStream.read(getBuf);
          } catch (IOException e) {
            e.printStackTrace();
          }
          // 创建实际长度的缓冲区
          byte[] outBuf = new byte[len];
          // 拷贝数据
          System.arraycopy(getBuf,0,outBuf,0,len);
          // 字节转化为字符
          String getText = new String(outBuf);
          // 显示文本到聊天框
          textArea.append(DateUntil.getNow()+" 敌方压缩:");
          textArea.append(getText);
          textArea.append("\r\n");
        }
      }
    }
  }



  public static void main(String[] args){
    ClientWin cw = new ClientWin();
    cw.setVisible(true);
  }
  // 按钮的监听方法
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == sendBtn){
      String clientSendText = textField.getText();
      if(!"".equals(clientSendText)){
        textArea.append(DateUntil.getNow()+" 我方压缩:");
        textArea.append(clientSendText);
        textArea.append("\r\n");
        textField.setText("");
        // 发送消息
        byte[] sendText = clientSendText.getBytes();
        try {
          outputStream.write(sendText);
        } catch (IOException e1) {
          e1.printStackTrace();
        }

      }
    }

  }
}
