package practice_9.part2;

import java.util.Arrays;
import java.util.List;

public class StreamMapSquare {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filtered = listInt.stream()
                .map(n -> n * n )
                .toList();
        System.out.print(filtered);
    }
}
