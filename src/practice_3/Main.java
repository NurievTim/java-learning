package practice_3;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Tom");
        Company employee2 = new Company(2, "Jerry");
        Company.companyName = "GoldApple";
        System.out.println(employee1.employeeID + " " + employee1.employeeName + " " + Company.companyName);
        System.out.println(employee2.employeeID + " " + employee2.employeeName + " " + Company.companyName);

        MathConstants.calculateCircleArea(2);
        MathConstants.calculateCircumference(3);
        MathConstants.calculateExponentialGrowth(1,2,3);

        Library library = new Library();
        library.setBookTitle("Богатый папа, бедный папа");
        library.setAuthor("Роберт Киосаки");
        library.setYear(2005);
        library.setCategory("Бизнес литература");
        System.out.println(library.getBookTitle() + " "
                + library.getAuthor() + " " + library.getYear() + " " + library.getCategory());

        University student1 = new University(1, "Max");
        University student2 = new University(2, "Kate");
        University student3 = new University(3, "Dima");
        University.universityName = "МГУ";
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings game1 = new GameSettings("NHL", 11);
        GameSettings game2 = new GameSettings("KHL", 10);
        GameSettings.setMaxPlayers(12);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Ivan", "Ivanov", "123-asd");
        Person person2 = new Person("Petr", "Sidorov", "asd-456");
        person2.setFirstName("Steve");
        person2.setLastName("Jobs");
        person2.printPersonInfo();
        person1.printPersonInfo();

    }
}
