public static class MathOperations {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(int x, int y) {
        return (double) x / y;
    }
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }
    public static int difference(int x, int y) {
        return Math.abs(y - x);
    }
    public static int squareArea(int side) {
        return side * side;
    }
    public static int squarePerimeter(int side) {
        return side * 4;
    }
    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
public static void main(String[] args) {
    System.out.println(MathOperations.add(1,2));
    System.out.println(MathOperations.subtract(2,3));
    System.out.println(MathOperations.multiply(2,4));
    System.out.println(MathOperations.divide(5,2));
    System.out.println(MathOperations.findMax(12,5));
    System.out.println(MathOperations.difference(12,5));
    System.out.println(MathOperations.squareArea(5));
    System.out.println(MathOperations.squarePerimeter(3));
    System.out.println(MathOperations.convertSecondsToMinutes(110));
    System.out.println(MathOperations.averageSpeed(100, 23));
    System.out.println(MathOperations.findHypotenuse(2, 3));
    System.out.println(MathOperations.findHypotenuse(20, 13));
    System.out.println(MathOperations.circleCircumference(25));
    System.out.println(MathOperations.circleCircumference(100));
    System.out.println(MathOperations.calculatePercentage(200, 25));
    System.out.println(MathOperations.celsiusToFahrenheit(25));
    System.out.println(MathOperations.fahrenheitToCelsius(105));
}
