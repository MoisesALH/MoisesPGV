package es.iespuertodelacruz.mlh.inetadressproject;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String url = "";
        String mensaje = "Introduce la url del equipo al que quieres doxear";
        /*
        try {
            System.out.println("LOCAL");

            InetAddress local = InetAddress.getByName("localhost");
            System.out.println("IP: " +local.getHostAddress());

            local = InetAddress.getLocalHost();
            System.out.println("IP: " + local.getHostAddress() + "\nNombre " + local.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
*/
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(mensaje);
            url = sc.nextLine();
            mensaje = "Introduce una url valida, maldite";
        } while(!urlOk(url));

        try {
            InetAddress local = InetAddress.getByName(url);
            System.out.println("IP: " + local.getHostAddress() + "\nNombre " + local.getHostName());
            System.out.println("De nada, maquine");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    public static boolean urlOk(String url){
        String urlRegex = "^www\\.[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
