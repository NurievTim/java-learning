package practice_7.ArrayList.task_1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private ArrayList<Integer> arrayList;

    public Task1() {
        this.arrayList = new ArrayList<>(List.of(1, 3, 5, 6, 8));
    }

    public void addElement(Integer element) {
        arrayList.addLast(element);
    }

    public void getArrayList() {
        System.out.println(arrayList);
    }
}
