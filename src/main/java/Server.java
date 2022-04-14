import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        int port = 8081;
        ServerSocket serverSocket = new ServerSocket(port);


            Socket clientSocket = serverSocket.accept(); // ждем подключения
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.println("New connection accepted");
            out.println("Write your name");
            String name = in.readLine();
            out.println("Are you child? (yes/no)");

            String answer1 = in.readLine();
            System.out.println(answer1);
            if (answer1.equals("yes")) {
                out.println("Welcome to the kids area, " + name + "! Let's play!");
            } else if (answer1.equals("no")) {
                out.println("Welcome to the adult zone, " + name + "! Have a good rest, or a good working day!");
            } else {
                out.println("Error");
                serverSocket.close();
            }
            serverSocket.close();

    }
}
