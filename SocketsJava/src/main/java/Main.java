import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Conectado al servidor!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messageFromServer = in.readLine();
            System.out.println("Mensaje del servidor: " + messageFromServer);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
