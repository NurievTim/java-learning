package practice_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    void getStudentName() {
        System.out.println(this.studentName);
    }

    void printStudentInfo() {
        System.out.println(this.studentName + ", " + this.studentID + ", " + universityName);
    }

}
