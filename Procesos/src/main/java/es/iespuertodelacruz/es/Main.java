package es.iespuertodelacruz.es;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  {
        //crearProceso("code");
        crearProceso();
        crearProceso2();
        crearProceso3();

    }
    public static void crearProceso(){
        ProcessBuilder pb = new ProcessBuilder( "cat", "/home/dam2/Escritorio/MoisesPGV/bbb.txt");
        try {
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = pb.start();
            process.waitFor();
            System.out.println("Fin del proceso");
        } catch (IOException e) {
            System.out.println("Errores de la vida");
        } catch (InterruptedException e) {
            System.out.println("Errores de la vida");
        }
    }

    public static void crearProceso2(){
        ProcessBuilder pb = new ProcessBuilder( "ifconfig");
        try {
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = pb.start();
            process.waitFor();
            System.out.println("Fin del proceso");
        } catch (IOException e) {
            System.out.println("Errores de la vida");
        } catch (InterruptedException e) {
            System.out.println("Errores de la vida");
        }
    }

    public static void crearProceso3(){
        ProcessBuilder pb = new ProcessBuilder( "ping", "www.google.es");
        try {
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = pb.start();
            process.waitFor();
            System.out.println("Fin del proceso");
        } catch (IOException e) {
            System.out.println("Errores de la vida");
        } catch (InterruptedException e) {
            System.out.println("Errores de la vida");
        }
    }

}

