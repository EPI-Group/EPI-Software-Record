package QQTalkTogether;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        while (true) {
            //获取一个客户端,就开一个线程
            Socket socket = server.accept();
            new Thread(new UpLoad(socket)).start();
        }
    }
}
