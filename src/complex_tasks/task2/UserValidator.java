package complex_tasks.task2;

public class UserValidator {
    private static boolean validationEnabled = true;

    public static boolean isValidationEnabled() {
        return validationEnabled;
    }

    public static void setValidationEnabled() {
        validationEnabled = !validationEnabled;
    }

    public static void validateName(User user) throws InvalidUserException {
        if (validationEnabled) {
            String name = user.getName();
            if (name != null && !name.isEmpty() && Character.isUpperCase(name.charAt(0))) {
                System.out.println("Имя корректно");
            } else throw new InvalidUserException("Имя должно быть не пустым и начинаться с заглавной буквы.");
        } else System.out.println("Валидация отключена");
    }

    public static void validateAge(User user) throws InvalidUserException {
        if (validationEnabled) {
            int age = user.getAge();
            if (age >= 18 && age <= 100) {
                System.out.println("Возраст корректен");
            } else throw new InvalidUserException("Возраст должен быть в пределах от 18 до 100 лет.");
        } else System.out.println("Валидация отключена");
    }

    public static void validateEmail(User user) throws InvalidUserException {
        if (validationEnabled) {
            String email = user.getEmail();
            if (email == null || email.isEmpty()) {
                throw new InvalidUserException("Email не может быть пустым");
            }
            String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
            if (!email.matches(emailRegex)) {
                throw new InvalidUserException("Email должен соответствовать стандартному формату электронной почты.");
            }
        } else System.out.println("Валидация отключена");
    }

}
