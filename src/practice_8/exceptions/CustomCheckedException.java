package practice_8.exceptions;

public class CustomCheckedException {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Невалидный возраст - " + age);
        }
        else {
            System.out.println("Возраст - " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(160);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }
}
