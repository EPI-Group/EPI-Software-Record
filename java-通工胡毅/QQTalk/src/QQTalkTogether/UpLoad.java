package QQTalkTogether;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Random;

public class UpLoad implements Runnable{
    private Socket socket;
    public UpLoad(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            File upload = new File("f:\\upload");
            if (!upload.exists()) {
                upload.mkdir();
            }

            String filename = "EPI" + System.currentTimeMillis()
                    + new Random().nextInt(999999) + ".jpg";
            FileOutputStream fos = new FileOutputStream(upload + File.separator + filename);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = in.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            socket.getOutputStream().write("图片上传成功!".getBytes());

            fos.close();
            socket.close();
        }catch (Exception ex){

        }
    }
}
