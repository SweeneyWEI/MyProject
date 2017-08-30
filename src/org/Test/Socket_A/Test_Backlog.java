package org.Test.Socket_A;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;

/**
 * Created by weixin on 17-8-6.
 */
public class Test_Backlog {


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8000,2);
        while(true){
            int i;
//            logger.debug("启动服务端-----");
            Socket socket=serverSocket.accept();
//            logger.debug("有客户端连上服务端，服务端信息如下："+socket.getInputStream());
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            do {
                char[] c=new char[1024];
                i=in.read(c);
//                logger.debug("服务端收到信息："+new String(c,0,i));
            }while(i==-1);
            out.close();
            in.close();
//            logger.debug("关闭服务器-----");

        }
    }
}
