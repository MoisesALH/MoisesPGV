package es.iespuertodelacruz.mlh;

import es.iespuertodelacruz.mlh.model.AI;
import es.iespuertodelacruz.mlh.model.Game;
import es.iespuertodelacruz.mlh.model.User;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int barcos;

        System.out.println("Introduce el tamaño del tablero");
        size = sc.nextInt();sc.nextLine();

        while(size > 25){
            System.out.println("El tamaño es demasiado grande, introduce otro tamaño mas pequeño");
            size = sc.nextInt();sc.nextLine();
        }
        System.out.println("Ahora introduce el numero de barcos");
        barcos = sc.nextInt();sc.nextLine();

        while (barcos > size){
            System.out.println("Por motivos de jugabilidad, es mejor que eligas un numero de barcos menor que el tamaño del tablero");
            barcos = sc.nextInt();sc.nextLine();
        }


        Game game = new Game(size,barcos);
        Thread user = new User(game);   //user y AI comparten el juego, ya que jugarán al contre ellos mismos y así compartirán el semaforo Turno, el cual solo permite 1.
        Thread ai = new AI(game);

        game.getBoard().mostrarTablero();

        user.start();
        ai.start();
    }
}