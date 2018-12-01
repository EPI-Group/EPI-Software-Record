package com.chat_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Client> clients = new ArrayList<Client>(); //保存客户端
    private boolean started = false;
    private ServerSocket socket = null;
    private Client client = null;

    public Server() {
        try {
            socket = new ServerSocket(8989);
            started = true;
        } catch (IOException ioe) {
            System.out.println("对不起，服务器不能启动！");
            ioe.printStackTrace();
            System.exit(-1);
        }
    }

    public void start() {
        try {
            Socket s = this.getSocket().accept(); 
            System.out.println("一个客户端连接...");
            if (s != null) {
                client = this.new Client(s, true);
                this.clients.add(client);
                new Thread(client).start();
                client = null;
            }
        } catch (IOException e) {
            System.out.println("连接错误！");
            e.printStackTrace();
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public ServerSocket getSocket() {
        return socket;
    }

    public void setSocket(ServerSocket socket) {
        this.socket = socket;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public static void main(String args[]) {
        Server cs = new Server();
        while (cs.isStarted()) {
            cs.start();
        }
    }

    private class Client implements Runnable {
        private boolean connected = false;
        private Socket s = null;
        private DataInputStream dis = null;
        private DataOutputStream dos = null;

        public Client(Socket s, boolean connected) {
            this.s = s;
            this.connected = connected;
        }
        //
        public void run() {
            InetAddress ip = null;
            int port = 9999;
            try {
                if (connected) {
                    dis = new DataInputStream(s.getInputStream());
                    dos = new DataOutputStream(s.getOutputStream());
                    ip = s.getInetAddress(); //得到IP
                    port = s.getPort();
                }
                while (connected) {
                    String line = dis.readUTF(); //接受消息
                    if (line.equals("exit")) {
                        getClients().remove(this); // 当接收到推出的消息，移除客户端记录
                        line = "再见~";
                        connected = false;
                    }
                    System.out.println("From: (" + ip.toString() + ":" + port + "): " + line);
                    for (int i = 0; i < getClients().size(); i++) {
                        if (this.equals(getClients().get(i))) {  //是本机
                            continue;
                        } else { //
                            getClients().get(i).dos.writeUTF("From: ("
                                    + ip.toString() + ":" + port + "): " + line + "\n");
                        }
                    }
                }

            } catch (IOException ioe) {
                System.out.println("客户端连接出错！");
                ioe.printStackTrace();
            }
        }
    }

}
