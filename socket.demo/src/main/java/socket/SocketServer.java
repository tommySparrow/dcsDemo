package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author User
 * socket服务端
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(9091);
        try {
            Socket client = server.accept();
            try {
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(client.getInputStream()));
                boolean flag = true;
                int count = 1;

                while (flag) {
                    System.out.println("客户端要开始发骚了，这是第" + count + "次！");
                    count++;

                    String line = input.readLine();
                    System.out.println("客户端说：" + line);

                }
            } finally {
                client.close();
            }
        } finally {
            server.close();
        }
    }
}
