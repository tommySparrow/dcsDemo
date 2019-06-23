package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author User
 * socket 通信客户端
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {

        Socket client = new Socket("127.0.0.1", 9091);
        try {
            PrintWriter output =
                    new PrintWriter(client.getOutputStream(), true);
            Scanner cin = new Scanner(System.in);
            String words;

            while (cin.hasNext()) {
                words = cin.nextLine();

                output.println(words);

                System.out.println("客户端写出数据:"+words);
            }

            cin.close();
        } finally {
            client.close();
        }

    }
}
