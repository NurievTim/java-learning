package practice_7.HashSet.Task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    private Set<Integer> hashSet;

    public Task2() {
        this.hashSet = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public void checkElementIsIn(Integer number) {
        if (hashSet.contains(number)) {
            System.out.println("Значение " + number + " есть в списке");
        }
        else System.out.println("Значение " + number + " отсутствует в списке");
    }
}
