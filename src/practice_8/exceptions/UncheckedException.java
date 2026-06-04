package practice_8.exceptions;

public class UncheckedException {
    public static void divide(int x, int y) {
        try {
            int result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        }
    }

    public static void main(String[] args) {
        divide(6, 0);
    }
}
