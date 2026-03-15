package practice_2;
//Класс Car
//Создайте класс Car с полями brand (строка) и year (целое число). Реализуйте конструктор с двумя параметрами,
// геттеры и сеттеры для обоих полей, метод print(), выводящий информацию о марке и годе выпуска.
// В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
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
        System.out.println("Марка автомобиля - " + this.brand + ", год выпуска - " + this.year);
    }
}
