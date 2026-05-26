package practice_4;

import java.util.Scanner;

public class DoWhileTaskSolver {

    public static void askPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Введите число: ");
            num = scanner.nextInt();
        } while (num <= 0);

        System.out.println("Введено положительное число");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = "qwerty";
        String psw;

        do {
            System.out.println("Введите пароль: ");
            psw = scanner.nextLine();
        } while (!psw.equals(password));

        System.out.println("Вы ввели правильный пароль");
    }

    public static void printFrom1to10() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitProgram() {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));

        System.out.println("Завершение программы");
    }

    public static void countDigits() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.println("Кол-во цифр = " + count);
    }

}
