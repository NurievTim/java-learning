package complex_tasks;

import complex_tasks.task3.GradeService;
import complex_tasks.task3.InvalidGradeException;
import complex_tasks.task3.StudentGrade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    @Test
    public void testAddGradeDouble() {
        StudentGrade<Double> student = new StudentGrade<>("Bob", "Math", 12.2);
        GradeService<Double> service = new GradeService<>();
        service.addGrade(student);

        assertTrue(service.getStudentGradeList().contains(student));
    }

    @Test
    public void testAddGradeNegativeDouble() {
        StudentGrade<Double> student = new StudentGrade<>("Bob", "Math", -12.2);
        GradeService<Double> service = new GradeService<>();

        InvalidGradeException exception = assertThrows(InvalidGradeException.class, () -> service.addGrade(student));
        assertEquals("Оценка отрицательная", exception.getMessage());
    }

    @Test
    public void testAddGradeNullThrowException() {
        StudentGrade<Double> student = new StudentGrade<>("Bob", "Math", null);
        GradeService<Double> service = new GradeService<>();

        InvalidGradeException exception = assertThrows(InvalidGradeException.class, () -> service.addGrade(student));
        assertEquals("Оценка отсутствует", exception.getMessage());
    }

    @Test
    public void testAddGradeInt() {
        StudentGrade<Integer> student = new StudentGrade<>("Bob", "Math", 12);
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(student);

        assertTrue(service.getStudentGradeList().contains(student));
    }

    @Test
    public void testAddGradeNegativeInt() {
        StudentGrade<Integer> student = new StudentGrade<>("Bob", "Math", -12);
        GradeService<Integer> service = new GradeService<>();

        InvalidGradeException exception = assertThrows(InvalidGradeException.class, () -> service.addGrade(student));
        assertEquals("Оценка отрицательная", exception.getMessage());
    }

    @Test
    public void testGetAverageGrade() {
        StudentGrade<Integer> student1 = new StudentGrade<>("Bob", "Math", 2);
        StudentGrade<Integer> student2 = new StudentGrade<>("Rob", "Math", 5);
        StudentGrade<Integer> student3 = new StudentGrade<>("Ann", "Math", 7);
        StudentGrade<Integer> student4 = new StudentGrade<>("Zak", "Literature", 3);
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(student1);
        service.addGrade(student2);
        service.addGrade(student3);
        service.addGrade(student4);

        assertEquals(4.7, service.getAverageGradeBySubject("Math"));
    }

    @Test
    public void testGetAverageGradeDouble() {
        StudentGrade<Double> student1 = new StudentGrade<>("Bob", "Math", 1.3);
        StudentGrade<Double> student2 = new StudentGrade<>("Rob", "Math", 5.2);
        StudentGrade<Double> student3 = new StudentGrade<>("Ann", "Math", 7.1);
        StudentGrade<Double> student4 = new StudentGrade<>("Zak", "Literature", 3.1);
        GradeService<Double> service = new GradeService<>();
        service.addGrade(student1);
        service.addGrade(student2);
        service.addGrade(student3);
        service.addGrade(student4);

        assertEquals(4.6, service.getAverageGradeBySubject("Math"));
    }

    @Test
    public void testGetAverageGradeByUnknownSubject() {
        StudentGrade<Double> student1 = new StudentGrade<>("Bob", "Math", 1.3);
        GradeService<Double> service = new GradeService<>();
        service.addGrade(student1);

        assertEquals(0.0, service.getAverageGradeBySubject("Physics"));
    }
}
