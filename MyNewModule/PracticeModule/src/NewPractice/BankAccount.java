package NewPractice;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Negative value not allowed");
        }
    }

    public void withdraw(double amount) {

    }

    public double getBalance() {
        return balance;
    }
}
