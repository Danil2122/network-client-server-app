import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int port = 8080;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            out.printf("GET / HTTP/1.1\nHost: localhost\nport: %d ",clientSocket.getPort());

            String resp = in.readLine();

            System.out.println(resp);
        }
    }
}
