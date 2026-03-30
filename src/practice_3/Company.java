package practice_3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName(){
        System.out.println(companyName);
        }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newName) {
        this.employeeName = newName;
    }

    }
