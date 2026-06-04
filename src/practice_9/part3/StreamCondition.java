package practice_9.part3;

import java.util.Arrays;
import java.util.List;

public class StreamCondition {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(2, 5, 6, 7, 12);
        boolean isEven = listInt.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.print(isEven);
    }
}
