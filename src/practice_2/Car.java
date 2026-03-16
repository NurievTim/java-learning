package practice_2;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand () {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
        System.out.println("Марка - " + this.brand + ". Год выпуска - " + this.year);
    }
}
