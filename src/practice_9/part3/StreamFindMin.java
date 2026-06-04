package practice_9.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamFindMin {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
        int aggregated = listInt.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.print(aggregated);
    }
}
