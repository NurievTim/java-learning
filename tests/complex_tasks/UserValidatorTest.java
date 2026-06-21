package complex_tasks;

import complex_tasks.task2.InvalidUserException;
import complex_tasks.task2.User;
import complex_tasks.task2.UserValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    @Test
    public void testValidateName() {
        User user = new User("Bob", 21, "BobRoss@gmail.com");

        assertDoesNotThrow(() -> UserValidator.validateName(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "bob"})
    public void testValidateNameEmpty(String name) {
        User user = new User(name, 21, "BobRoss@gmail.com");

        InvalidUserException exception = assertThrows(InvalidUserException.class, () -> UserValidator.validateName(user));
        assertEquals("Имя должно быть не пустым и начинаться с заглавной буквы.", exception.getMessage());
    }

    @Test
    public void testValidateNameDoesNotThrowValidationEnable() {
        User user = new User("Bob", 21, "BobRoss@gmail.com");
        UserValidator.toggleValidation();

        assertDoesNotThrow(() -> UserValidator.validateName(user));
    }

    @Test
    public void testValidateEmailDoesNotThrowValidationEnable() {
        User user = new User("Bob", 21, "BobRoss@");
        UserValidator.toggleValidation();

        assertDoesNotThrow(() -> UserValidator.validateName(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "B@gmail",
            "@gmail.com",
            "BobRossgmail.com",
            "BobRoss@.com",
            "gmail.com",
            "Bobross@.c",
            "BobRoss@.comcomcom"
    })
    public void testValidateEmailThrowException(String email) {
        User user = new User("Bob", 21, email);

        InvalidUserException exception = assertThrows(InvalidUserException.class, () -> UserValidator.validateEmail(user));
        assertEquals("Email должен соответствовать стандартному формату электронной почты.", exception.getMessage());
    }

    @Test
    public void testValidateEmail() {
        User user = new User("Bob", 21, "BobRoss@gmail.com");

        assertDoesNotThrow(() -> UserValidator.validateEmail(user));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 100, 25})
    public void testValidateAge(int age) {
        User user = new User("Bob", age, "BobRoss@gmail.com");

        assertDoesNotThrow(() -> UserValidator.validateAge(user));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 17, 101})
    public void testValidateAgeThrowException(int age) {
        User user = new User("Bob", age, "BobRoss@gmail.com");

        InvalidUserException exception = assertThrows(InvalidUserException.class, () -> UserValidator.validateAge(user));
        assertEquals("Возраст должен быть в пределах от 18 до 100 лет.", exception.getMessage());
    }
}
