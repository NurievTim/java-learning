package practice_3;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static void calculateCircleArea(double r) {
        double result = PI * r * r;
        System.out.println("Плащадь круга = " + result);
    }

    static void calculateCircumference(double r){
        double result = 2 * PI * r;
        System.out.println("Длинна окружности = " + result);
    }

    static void calculateExponentialGrowth(double initialValue, double rate, double time) {
        double result = initialValue * Math.pow(E, rate * time);
        System.out.println("Экспоненциальный рост = " + result);
    }
}
