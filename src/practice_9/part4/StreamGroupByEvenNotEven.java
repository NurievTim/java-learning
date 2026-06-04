package practice_9.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupByEvenNotEven {
    public static void main(String[] args) {
        List<Integer> isEven = Arrays.asList(2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> groupedIsEven = isEven.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.print(groupedIsEven);
    }
}
