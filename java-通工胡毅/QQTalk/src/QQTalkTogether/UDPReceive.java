package QQTalkTogether;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    实现UDP接收器
    永不停歇的接收端
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] data = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data,data.length);

        while(true) {
            //拆包
            ds.receive(dp);
            int length = dp.getLength();
            String IP = dp.getAddress().getHostAddress();

            System.out.println(new String(data, 0, length) + "  发送方IP为:" + IP);
        }
    }
}
