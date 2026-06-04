package practice_9.part1;

public class MathOperationMain {
    public static void main(String[] args) {
        MathOperation sum = Integer::sum;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation divide = (a, b) -> a / b;
        MathOperation multiply = (a, b) -> a * b ;

        System.out.println(sum.operate(1, 2));
        System.out.println(subtract.operate(4, 2));
        System.out.println(divide.operate(4, 2));
        System.out.println(multiply.operate(4, 2));
    }
}
