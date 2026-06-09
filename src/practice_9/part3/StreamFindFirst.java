package practice_9.part3;

import java.util.Arrays;
import java.util.List;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Hello", "Lessons", "Букля", "StreamAPI", "Баранка");
        String string = listString.stream()
                        .filter(element -> element.startsWith("Б"))
                        .findFirst()
                        .get();
        System.out.print(string);
    }
}
