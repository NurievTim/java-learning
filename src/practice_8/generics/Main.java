package practice_8.generics;

public class Main {
    public static <T> void printArray(T[] array) {
        for (T elem : array) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"a", "b", "c"};

        printArray(intArr);
        printArray(strArr);
    }
}
