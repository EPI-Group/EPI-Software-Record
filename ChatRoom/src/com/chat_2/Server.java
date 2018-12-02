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
            socket = new ServerSocket(9876);
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
        private String name=null;
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
                    this.name=port+"";
                }
                while (connected) {
                    String line = dis.readUTF(); //接受消息
                    if (line.equals("exit")) {
                        getClients().remove(this); //移除这个客户端
                        line = "再见~";
                        connected = false;
                    }
                    if(line.startsWith("@")){
                        int index=line.indexOf("：");
                        String target=line.substring(1,index);
                        line=line.substring(index+1);
                        for (int i = 0; i < getClients().size(); i++) {
                            if (target.equals(getClients().get(i).name)) {
                                getClients().get(i).dos.writeUTF(
                                        this.name+"悄悄对您说: " + line + "\n");
                                break;
                            }
                        }
                    }else {

                        for (int i = 0; i < getClients().size(); i++) {
                            if (this.equals(getClients().get(i))) {
                                continue;
                            } else { //
                                getClients().get(i).dos.writeUTF(this.name + "对大家说: " + line + "\n");
                            }
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
