package practice_9.part2;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMoreThan5 {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Hello", "Lessons", "world", "StreamAPI");
        List<String> filtered = listString.stream()
                .filter(n -> n.length() > 5)
                .toList();
        System.out.print(filtered);
    }


}
