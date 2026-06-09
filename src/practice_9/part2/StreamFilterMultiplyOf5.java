package practice_9.part2;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMultiplyOf5 {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 15, 5, 3, 4);
        List<Integer> filtered = listInt.stream()
                        .filter(n -> n % 5 == 0)
                        .toList();
        System.out.print(filtered);
    }
}
