package practice_7.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeTask {
    private ArrayDeque<String> arrayDeque = new ArrayDeque<>();

    public void printArrayDeque() {
        System.out.println(arrayDeque);
    }

    public void addToDeque(String element) {
        arrayDeque.push(element);
    }

    public void removeElements() {
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pop());
        }
    }


}
