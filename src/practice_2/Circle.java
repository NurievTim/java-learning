package practice_2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    void calculateArea() {
        System.out.println(Math.PI * this.radius * this.radius);
    }

    void calculateCircumference() {
        System.out.println(2 * Math.PI * this.radius);
    }
}

