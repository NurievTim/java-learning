package practice_7.LinkedList.Task1;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    private LinkedList<String> linkedList;

    public Task1() {
        this.linkedList = new LinkedList<>(List.of("hello", "world", "i", "love", "java"));
    }

    public void getLinkedList() {
        System.out.println(linkedList);
    }
}
