package practice_2;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println("Учитель - " + this.name + " по предмету " + this.subject);
    }


 }
