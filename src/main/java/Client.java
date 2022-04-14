import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {

        String host = "netology.homework";
        int port = 8081;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String name = in.readLine();
            System.out.println(name);

            out.println("Vac");

            String question1 = in.readLine();
            System.out.println(question1);

            out.println("yes");

            String resp = in.readLine();
            System.out.println(resp);



        }
    }
}
