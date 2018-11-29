package control;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client implements Runnable {// 客户端
  static Socket socket = null;
  Scanner input = new Scanner(System.in);
  static String name=null;
  public static void main(String[] args) {
    int x=(int)(Math.random()*100);
    Client.name="Client"+x;
    System.out.println("************客户端"+x+"*************");
    try {
      socket = new Socket("localhost", 8080);
      System.out.println("已经连上服务器了");
    } catch (Exception e) {
      e.printStackTrace();
    }
    Client client = new Client();
    Read r = new Read(socket);
    Thread print = new Thread(client);
    Thread read = new Thread(r);
    print.start();
    read.start();
  }
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      PrintWriter out = new PrintWriter(socket.getOutputStream());
      while (true) {
        String msg = input.next();
        // 输入流输入信息
        out.println(name+"说:"+msg);
        out.flush();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
class Read implements Runnable {
  static Socket socket = null;
  public Read(Socket socket) {
    this.socket = socket;
  }
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      // 进行打印服务器传来的字节
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      while (true) {
        System.out.println(in.readLine());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

