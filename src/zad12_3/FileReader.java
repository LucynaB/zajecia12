package zad12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileReader {
    File file;

    public FileReader(String path) {
        this.file = new File(path);
    }

    public List<Integer> readData() throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();

        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }
        return numbers;
    }
}
