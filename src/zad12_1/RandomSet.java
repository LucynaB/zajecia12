package zad12_1;

import java.awt.*;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomSet {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < 50; i++) {
            set.add(rand.nextInt(1000));
        }

        System.out.println("Min: " + ((TreeSet<Integer>) set).first());
        System.out.println("Max: " + ((TreeSet<Integer>) set).last());

        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }

        int srednia = sum/set.size();
        System.out.println("średnia: "+srednia);

        for (Integer integer : set) {
            if(integer>srednia){
                System.out.println(integer);
            }
        }

    }
}
