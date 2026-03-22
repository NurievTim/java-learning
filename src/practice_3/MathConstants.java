package practice_3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    static void calculateCircleArea(double r) {
        MathConstants obj = new MathConstants();
        double result = obj.PI * r * r;
        System.out.println("Плащадь круга = " + result);
    }

    static void calculateCircumference(double r){
        MathConstants obj = new MathConstants();
        double result = 2 * obj.PI * r;
        System.out.println("Длинна окружности = " + result);
    }

    static void calculateExponentialGrowth(double initialValue, double rate, double time) {
        MathConstants obj = new MathConstants();
        double result = initialValue * Math.pow(obj.E, rate * time);
        System.out.println("Экспоненциальный рост = " + result);
    }
}
