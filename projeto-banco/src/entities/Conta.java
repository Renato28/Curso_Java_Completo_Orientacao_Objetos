package entities;

public class Conta {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Conta() {

    }

    public Conta(int accountNumber, String accountHolder, double inicialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.deposit(inicialDeposit);
    }

    public Conta(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", "
                + " Holder: "
                + accountHolder
                + ", "
                + " Balance: $"
                + String.format("%.2f ", balance);
    }
}
