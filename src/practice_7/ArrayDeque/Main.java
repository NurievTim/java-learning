package practice_7.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDequeTask arrayDeque = new ArrayDequeTask();
        arrayDeque.addToDeque("один");
        arrayDeque.addToDeque("два");
        arrayDeque.addToDeque("три");
        arrayDeque.addToDeque("четыре");
        arrayDeque.printArrayDeque();
        arrayDeque.removeElements();
        arrayDeque.printArrayDeque();
    }
}
