package practice_9.part4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAverageNumber {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(2, 3, 4, 5, 6);
        OptionalDouble average = listInt.stream()
                        .mapToInt(n -> n)
                        .average();

        System.out.print(average);
    }
}
