package zad12_1;


import java.util.Random;
import java.util.TreeSet;

public class RandomSet {
    public static void main(String[] args) {
        Random rand = new Random();
        TreeSet<Integer> set = new TreeSet<>();

        while (set.size() != 50) {
            set.add(rand.nextInt(1000));
        }


        System.out.println("Min: " + set.first());
        System.out.println("Max: " + set.last());

        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }

        int srednia = sum / set.size();
        System.out.println("średnia: " + srednia);

        for (Integer integer : set) {
            if (integer > srednia) {
                System.out.println(integer);
            }
        }

    }
}
