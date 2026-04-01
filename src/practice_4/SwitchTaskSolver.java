package practice_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    Scanner scanner = new Scanner(System.in);
    public String checkDay() {
        int day = scanner.nextInt();
        String dayOfWeek = "";

        switch (day) {
            case 1 -> dayOfWeek = "Понедельник";
            case 2 -> dayOfWeek = "Вторник";
            case 3 -> dayOfWeek = "Среда";
            case 4 -> dayOfWeek = "Четверг";
            case 5 -> dayOfWeek = "Пятница";
            case 6 -> dayOfWeek = "Суббота";
            case 7 -> dayOfWeek = "Воскресенье";
            default -> dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }

    public String checkTicketPrice() {
        int day = scanner.nextInt();
        String price = "";

        switch (day) {
            case 1, 2, 3, 4, 5 -> price = "300 рублей";
            case 6, 7 -> price = "450 рублей";
            default -> price = "Несуществующий день недели";
        }
        return price;
    }

    public String integerToStringGrade() {
        int score = scanner.nextInt();
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else grade = "такой оценки нет";
        return grade;
    }

    public String textCommand() {
        String command = scanner.nextLine();
        String response;

        switch (command) {
            case "start" -> response = "Система запущена";
            case "stop" -> response = "Система приостановлена";
            case "restart" -> response = "Система перезагружена";
            case "status" -> response = "Статус системы";
            default -> response = "Такой команды нету";
        }
        return response;
    }

    public double calculator() {
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextInt();

        System.out.println("Введите оператор (+, -, *, /):  ");
        String operator = scanner.next();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextInt();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Деление на 0 невозможно");
            } else result = num1 / num2;
                break;
            default:
                System.out.println("Выбран неправильный оператор");
                break;
        }
        return result;


    }

}
