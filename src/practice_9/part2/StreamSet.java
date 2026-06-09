package practice_9.part2;

import java.util.Arrays;
import java.util.List;

public class StreamSet {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 2, 7, 5, 3, 4, 5);
        List<Integer> filtered = listInt.stream()
                        .distinct()
                        .toList();
        System.out.print(filtered);
    }
}
