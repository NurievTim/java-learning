package practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static void printEven() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printFromNumberTo1() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }
}
