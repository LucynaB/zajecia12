package zad12_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        int suma = 0;
        String wynik = "";
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (i < 10) {


            System.out.println("Podaj liczbę: ");
            queue.offer(scan.nextInt());
            suma += ((LinkedList<Integer>) queue).peek();
            if (i != 9) {
                wynik += ((LinkedList<Integer>) queue).poll() + "+";
            } else
                wynik += ((LinkedList<Integer>) queue).poll() + "=";

            i++;

        }

        System.out.println(wynik + suma);

    }
}
