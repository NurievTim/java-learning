package complex_tasks.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> studentGradeList = new ArrayList<>();

    public List<StudentGrade<T>> getStudentGradeList() {
        return studentGradeList;
    }

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade == null || grade.getGrade() == null) {
            throw new InvalidGradeException("Оценка отсутствует");
        }
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка отрицательная");
        }
        studentGradeList.add(grade);
    }

    public double getAverageGradeBySubject(String subject) {
        double averageGrade = studentGradeList.stream()
                .filter(studentGrade -> studentGrade.getSubject().equals(subject))
                .mapToDouble(studentGrade -> studentGrade.getGrade().doubleValue())
                .average()
                .orElse(0.0);
        return BigDecimal.valueOf(averageGrade).setScale(1, RoundingMode.CEILING).doubleValue();
    }

}
