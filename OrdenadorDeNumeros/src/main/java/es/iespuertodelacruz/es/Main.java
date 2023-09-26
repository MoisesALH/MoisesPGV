package es.iespuertodelacruz.es;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader();
        ArrayList<Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            numeros.add(Integer.parseInt(sc.nextLine()));
        }
        numeros.sort(new Comparar());

        numeros.stream().forEach(System.out::println);
    }

    static class Comparar implements Comparator<Integer>{
        @Override
        public int compare(Integer a, Integer b){
            return Integer.compare(a,b);
        }
    }
}