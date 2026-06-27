package complex_tasks.task3;

public class StudentGrade<T extends Number> {
    private String studentName;
    private T grade;
    private String subject;

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    public StudentGrade(String studentName, String subject, T grade) {
        this.studentName = studentName;
        this.subject = subject;
        this.grade = grade;
    }


}
