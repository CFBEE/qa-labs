package lab02_OOP;

public class Account {
	// Part 1 - Step 2 - create class private fields
	private int id;
	private String owner;
	private double balance;

	// Part 1 - Step 5 - create constructor
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}

	// Part 1 - Steps 2 & 3 - create Deposit method with error handling
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Error: Cannot deposit a negative amount.");
		} else {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
	}

	// Part 1 - Steps 2 & 4 - create Withdraw method with error handling
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Error: Cannot withdraw a negative amount.");
		} else if (amount > balance) {
			System.out.println("Error: Insufficient funds.");
		} else {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		}
	}

	// Part 1 - Step 6 - return formatted string of details
	public String getDetails() {
		return "Account Id: " + id + ", Owner: " + owner + ", Balance: " + balance;
	}
	
	// Part 3 - Step 1 - new addInterest Method
	public void addInterest() {
		// Add a 2.5% interest charge
		balance += balance * 0.025;
	}

}
