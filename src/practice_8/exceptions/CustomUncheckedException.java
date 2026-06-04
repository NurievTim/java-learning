package practice_8.exceptions;

public class CustomUncheckedException {
    public static void validateEmail(String email) {
        if (email == null) {
            throw new InvalidEmailException("Email не может быть пустым");
        }
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        if (!email.matches(emailRegex)) {
            throw new InvalidEmailException(email + " - этот email некорректный");
        }
        System.out.println(email + " этот email корректный");
    }

    public static void main(String[] args) {
        validateEmail("1-2@123");
    }
}
