package practice_9.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupByFirstLetter {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Hello", "Lessons", "Lizard", "Hi");
        Map<Character, List<String>> grouped = listString.stream()
                        .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.print(grouped);
    }
}
