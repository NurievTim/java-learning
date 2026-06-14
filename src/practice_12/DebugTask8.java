package practice_12;

import static java.lang.Double.compare;
import static java.lang.Math.abs;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        double epsilon = 0.00001;
        if (abs(a - b) < epsilon) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
