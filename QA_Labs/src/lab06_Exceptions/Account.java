package lab06_Exceptions;

public class Account {
    private int id;
    private double balance;
    private String owner;

    public Account(int id, double balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public void withdraw(double amount) {
        balance -= amount;
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Withdrawal of £" + amount + " would overdraw account " + id
            );
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void close() {
        System.out.println("Account " + id + " is closed.");
    }

    public String getDetails() {
        return "Account ID: " + id + ", Owner: " + owner + ", Balance: £ " + String.format("%.2f", balance);
    }
}
