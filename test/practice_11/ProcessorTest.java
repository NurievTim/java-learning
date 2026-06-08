package practice_11;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessorTest extends Processor {

    @ParameterizedTest
    @ValueSource(ints = {2, 0, -2})
    public void testIsEvenValidNumber(int number) {
        assertTrue(processor.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -3})
    public void testIsEvenInvalidNumber(int number) {
        assertFalse(processor.isEven(number));
    }

    @ParameterizedTest
    @CsvSource({
            "'hello', 2",
            "'java', 2",
            "'AEIOU', 5",
            "'', 0",
            "'sdfg', 0"
    })
    public void testCountVowelsValidStrings(String input, int count) {
        assertEquals((processor.countVowels(input)), count);
    }

    @Test
    public void testShouldThrowExceptionWhenInputIsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> processor.countVowels(null));
        assertEquals("Input cannot be null", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "'Hello', 'olleH'",
            "'', ''",
            "'H', 'H'",
    })
    public void testReverseStringValid(String input, String expected) {
        assertEquals(expected, processor.reverse(input));
    }

    @Test
    public void testReverseNullReturnsNull() {
        assertNull(processor.reverse(null));
    }

    static Stream<Arguments> providesArraysForFindMaxTest() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2),
                Arguments.of(new int[]{-3, -5, 7, -2}, 7),
                Arguments.of(new int[]{0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("providesArraysForFindMaxTest")
    public void testFindMaxReturnsMaxInt(int[] array, int expectedMax) {
        assertEquals(expectedMax, (processor.findMax(array)));
    }

    @ParameterizedTest
    @EmptySource
    public void testShouldThrowExceptionWhenEmptyArrayInFindMax(int[] emptyArray) {
        assertThrows(NoSuchElementException.class, () -> processor.findMax(emptyArray));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600, 4})
    public void testIsLeapYears(int year) {
        assertTrue(processor.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2023, 2001, 1602, 1900, 2100})
    public void testIsNoNLeapYears(int year) {
        assertFalse(processor.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com"})
    public void testIsValidEmail(String email) {
        assertTrue(processor.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol"})
    public void testIsValidEmailIncorrect(String email) {
        assertFalse(processor.isValidEmail(email));
    }

    @Test
    public void testIsValidEmailNull() {
        assertFalse(processor.isValidEmail(null));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "5, 120",
            "7, 5040",
    })
    public void testFactorialValidInt(int number, int result) {
        assertEquals(processor.factorial(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -3})
    public void testFactorialInvalidInt(int number) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> processor.factorial(number));
        assertEquals("Negative numbers not allowed", exception.getMessage());
    }

    static Stream<Arguments> providesArraysForFindSecondMaxTest() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
                Arguments.of(new int[]{-3, -5, -7, -2}, -3)
        );
    }
    @ParameterizedTest
    @MethodSource("providesArraysForFindSecondMaxTest")
    public void testFindSecondMax(int[] array, int expected) {
        assertEquals(expected, processor.findSecondMax(array));
    }

    static Stream<Arguments> providesArraysWithDuplicatesForFindSecondMaxTest() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 3, 3, 4, 4}, 3),
                Arguments.of(new int[]{2, 3, 5, 5, 5}, 2)
        );
    }
    @ParameterizedTest
    @MethodSource("providesArraysWithDuplicatesForFindSecondMaxTest")
    public void testFindSecondMaxInDuplicatesArrays(int[] array, int expected) {
        assertEquals(expected, processor.findSecondMax(array));
    }

    @Test
    public void testFindSecondMaxShouldThrowExceptionWithAllDuplicatesElementArray() {
        int[] emptyArray = {3, 3, 3};
        assertThrows(NoSuchElementException.class, () -> processor.findSecondMax(emptyArray));
    }

    @Test
    public void testFindSecondMaxShouldThrowExceptionWithSingleElementArray() {
        int[] emptyArray = {1};
        assertThrows(IllegalArgumentException.class, () -> processor.findSecondMax(emptyArray));
    }

    @Test
    public void testFindSecondMaxShouldThrowExceptionWithEmptyArray() {
        int[] emptyArray = {};
        assertThrows(IllegalArgumentException.class, () -> processor.findSecondMax(emptyArray));
    }

    @ParameterizedTest
    @CsvSource({
            "'Hello World', 2",
            "'Hello  World', 2",
            "'Hello  World !', 3",
            "'  ', 0",
    })
    public void testCountWords(String sentence, int count) {
        assertEquals(count, processor.countWords(sentence));
    }

    @Test
    public void testCountWordsWithNullShouldThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> processor.countWords(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+12 1234567890", "+123 1234567890", })
    public void testIsValidPhoneNumberWithCorrectPhone(String phone) {
        assertTrue(processor.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "-123 1234567890", "123 0987654321"})
    public void testIsValidPhoneNumberWithIncorrectPhone(String phone) {
        assertFalse(processor.isValidPhoneNumber(phone));
    }

    @Test
    public void testIsValidPhoneNumberWithNullShouldThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> processor.isValidPhoneNumber(null));
    }
}
