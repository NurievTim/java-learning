package practice_9.part2;

import java.util.Arrays;
import java.util.List;

public class StreamMapStringToLength {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("Hello", "Lessons", "world", "StreamAPI");
        List<Integer> filtered = listStrings.stream()
                        .map(String::length)
                        .toList();
        System.out.print(filtered);
    }
}
