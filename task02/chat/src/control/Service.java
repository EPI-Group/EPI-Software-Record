package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 服务器端
public class Server implements Runnable {
  // 构建Socket集合 用于将每一个客户添加进来便于后期散发信息
  private static List<Socket> socketList=new ArrayList<>();
  private static ServerSocket serverSocket = null;
  private static Socket socket = null;

  // 构造方法 强制占用tomact端口号。。。。
  public Server() {
    try {
      serverSocket = new ServerSocket(8080);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("************服务端已经启动*************");
    Server server = new Server();
    // 动态检测连接人数
    int count = 0;
    // 服务器处于不停止状态等待用户的连接
    while (true) {
      try {
        // 返回socket则表明有用户已经连接
        socket = serverSocket.accept();
        // 上线人数+1
        ++count;
        // 后期加在状态框上动态显示上线人数
        System.out.println("上线人数"+count+"个");
        // 将用户socket添加到Socket集合中
        socketList.add(socket);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      Print p = new Print(socket);
      // 创建读取和接受的线程
      Thread read = new Thread(server);
      Thread print = new Thread(p);
      // 启动线程
      read.start();
      print.start();
    }
  }
  @Override
  public void run() {
    // 重写run方法
    try {
      Thread.sleep(1000);
      // 获取Socket输入流
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      while (true) {
        String getText = in.readLine();
        // 显示在控制台
        System.out.println( getText);
        // 实现将一个用户的消息发送给每个用户
        for (int i = 0; i < socketList.size(); i++) {
          Socket socket=socketList.get(i);
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          // 判断
          if (socket!=this.socket) {
            out.println(getText);
          }else{
            out.println("我:"+getText);
          }
          out.flush();
        }
      }
    } catch (Exception e) {

      e.printStackTrace();
    }
  }
}
class Print implements Runnable {
  static List<Socket> socketList=new ArrayList<>();
  Scanner input = new Scanner(System.in);
  // 构造方法
  public Print(Socket s) {
    try {
      socketList.add(s);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      while (true) {
        String msg = input.next();
        // 对每一个用户socket输出流进行输出
        for (int i = 0; i < socketList.size(); i++) {
          Socket socket=socketList.get(i);
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          out.println("服务端说："+msg);
          out.flush();
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}

