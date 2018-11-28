package QQTalkTogether;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
/*
    UDP发送端
    输入完毕,发送给接收端
 */

public class UDPSend {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InetAddress inet = InetAddress.getByName("DESKTOP-DTG7BSI");
        DatagramSocket ds = new DatagramSocket();
        while(true) {
            String message = sc.nextLine();

            if(message.equals("++")) {
                SendPicture();
            }else {

                byte[] data = message.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length, inet, 1234);
                ds.send(dp);
            }
        }

    }

    public static void SendPicture() throws IOException {
        Socket socket = new Socket("DESKTOP-DTG7BSI",1234);
        OutputStream out = socket.getOutputStream();

        System.out.println("请输入这个图片的绝对路径:");
        FileInputStream fis = new FileInputStream(new String(new Scanner(System.in).next()));

        int len = 0;
        byte[] data = new byte[1024];
        while ((len = fis.read(data)) != -1){
            out.write(data,0,len);
        }
        //给服务器写终止序列
        socket.shutdownOutput();

        //上传成功
        InputStream in = socket.getInputStream();
        len = in.read(data);
        System.out.println(new String(data,0,len));

        socket.close();
        fis.close();
    }
}
