package practice_2;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    void calculateArea() {
         System.out.println("Площадь прямоугольника = " + this.width * this.height);
    }
}
