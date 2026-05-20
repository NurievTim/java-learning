package practice_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    Scanner scanner = new Scanner(System.in);
    public String checkPositiveOrNegative() {
        int x = scanner.nextInt();
        String result = "";
        if (x > 0){
            result = "Число положительное";
        } else if (x < 0) {
            result = "Число отрицательное";
        }
        else result = "Число равно нулю";
        return result;

    }

    public int findMax() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max;

        if (a > b) {
            max = a;
        }
        else max = b;
        return max;
    }

    public void printGrade() {
        int x = scanner.nextInt();

        switch (x) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2, 1:
                System.out.println("Неудовлетворительно");
                break;
        }
    }

    public String checkParity() {
        int x = scanner.nextInt();
        String parity = "";

        if (x % 2 == 0) {
            parity = "четное";
        }
        else parity = "нечетное";
        return parity;
    }

    public String checkDiscount() {
        int age = scanner.nextInt();
        String discount = "";

        if (age < 18) {
            discount = "Скидка 25%";
        } else if (age >= 65) {
            discount = "Скидка 30%";
        }
        else discount = "Скидки нет";
        return discount;
    }

    public String checkTestResult() {
        int result = scanner.nextInt();
        String evaluation = "";

        if (result >= 90 && result <= 100) {
            evaluation = "Отлично";
        } else if (result >= 75 && result <= 89) {
            evaluation = "Хорошо";
        } else if (result >= 60 && result <= 74) {
            evaluation = "Удовлетворительно";
        } else if (result < 60 && result >= 0) {
            evaluation = "Неудовлетворительно";
        } else {
            evaluation = "Некорректный ввод";
        }
        return evaluation;
    }
}
