package practice_7.ArrayList.task_2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private ArrayList<Integer> arrayList;

    public Task2() {
        this.arrayList = new ArrayList<>(List.of(1, 3, 5, 6, 8));
    }

    public void getEvenArrayList() {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        arrayList.forEach(
                element -> {
                    if (element % 2 == 0) {
                        newArrayList.add(element);
                    }
                }
        );
        System.out.println(newArrayList);
    }
}
