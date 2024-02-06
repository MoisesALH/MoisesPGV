package es.iespuertodelacruz.mlh.vigenere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mensaje = "";
        String key = "";
        String cifrado = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mensaje");
        mensaje = sc.nextLine().toUpperCase();

        System.out.println("Introduce la clave");
        key = sc.nextLine().toUpperCase();

        int indexKey = 0;
        for (int i = 0; i < mensaje.length(); i++){
            int letraInt = ( (mensaje.charAt(i) - 'A') + (key.charAt(indexKey) - 'A')) % 26;
            char letra = (char) ('A' + letraInt);
            cifrado += letra;
            indexKey++;
            if(indexKey >= key.length()){
                indexKey = 0;
            }
        }

        System.out.println("Mensaje cifrado: " + cifrado);
    }
}
