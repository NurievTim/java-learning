package practice_8.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
