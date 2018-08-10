package zad12_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        int suma = 0;
        String wynik = "";
        int i = 0;
        while (i < 10) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Podaj liczbę: ");
            queue.offer(scan.nextInt());
            suma += ((LinkedList<Integer>) queue).peekLast();
            if (i != 9) {
                wynik += ((LinkedList<Integer>) queue).peekLast() + "+";
            } else
                wynik += ((LinkedList<Integer>) queue).peekLast() + "=";

            i++;

        }

        System.out.println(wynik + suma);

    }
}
