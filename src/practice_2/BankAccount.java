package practice_2;

public class BankAccount {
    String owner;
    int balance = 0;

    public BankAccount(String owner) {
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    int getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        this.balance -= amount;
        System.out.println("Вы сняли " + amount);
    }

    void printBalance() {
        System.out.println("Ваш баланс = " + this.balance);
    }
}
