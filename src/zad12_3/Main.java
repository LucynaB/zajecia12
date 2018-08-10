package zad12_3;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("liczby.txt");
        List<Integer> numbers = fr.readData();

        System.out.println(numbers);
        TreeMap<Integer, Integer> map = zlicz(numbers);

        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer + " - liczba wystąpień: " + map.get(integer));
        }
    }


    public static TreeMap<Integer, Integer> zlicz(List<Integer> list) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Integer ilosc;

        for (int i = 0; i < list.size(); i++) {
            if (!map.keySet().contains(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                ilosc = map.get(list.get(i)) + 1;
                map.put(list.get(i), ilosc);
            }

        }

        return map;
    }
}
