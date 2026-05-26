package practice_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void sumWhilePositive() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Введите число: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Сумма = " + sum);
    }

    public static void printNumbers() {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            System.out.println("Положительно " + num);
        }

    }

    public static void stopCommand() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите комманду: ");
            String in = scanner.nextLine();

            if (in.equals("stop")) {
                break;
            }
        }
        System.out.println("Программа завершена");
    }
}
