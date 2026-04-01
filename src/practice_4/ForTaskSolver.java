package practice_4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void printMultiplesOfThree() {
        for (int i = 1; i < 100; i++ ) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void isSimple() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число непростое");
        }
    }

    public static void printFrom1to10() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }


}
