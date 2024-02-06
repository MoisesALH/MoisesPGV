package es.iespuertodelacruz.mlh.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String server = "ftp.rediris.es";
        int port = 21;
        String user = "anonymous";
        String password = "anonymous";

        FTPClient ftpClient = new FTPClient();

        try {

            ftpClient.connect(server, port);
            int replyCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                System.err.println("Error al conectar al servidor FTP");
                return;
            }

            if (ftpClient.login(user, password)) {
                System.out.println("Conexión exitosa al servidor FTP");

                ftpClient.enterLocalPassiveMode();

                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

                String[] fileNames = ftpClient.listNames();
                if (fileNames != null) {
                    System.out.println("Archivos en el directorio raíz:");
                    for (String fileName : fileNames) {
                        System.out.println(fileName);
                    }
                } else {
                    System.out.println("No se encontraron archivos en el directorio raíz.");
                }

                ftpClient.logout();
                ftpClient.disconnect();
            } else {
                System.err.println("Inicio de sesión fallido");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
