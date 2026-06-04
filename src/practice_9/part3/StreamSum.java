package practice_9.part3;

import java.util.Arrays;
import java.util.List;

public class StreamSum {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
        int sum = listInt.stream()
                        .mapToInt(n -> n)
                        .sum();
        System.out.print(sum);
    }
}
