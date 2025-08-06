package lab02_OOP;

public class Program {

	public static void main(String[] args) {
		// Part 1 - Step 7 - create instance of Account Class
		Account myAccount = new Account(1234, "Conor", 800.0);

		System.out.println("Display tests from Part 1");
		// Part 1 - Step 8 - Invoke and Test valid and invalid deposits
		myAccount.deposit(200);
		myAccount.deposit(-10);

		// Part 1 - Step 8 - Test valid and invalid withdrawals
		myAccount.withdraw(200);
		myAccount.withdraw(-200);
		myAccount.withdraw(1500);

		// Part 1 - Step 9 - Call getDetails method
		String details = myAccount.getDetails();
		System.out.println(details);

		// Part 2 - Step 1 - Create an array of 3 Accounts
		Account account1 = new Account(56789, "Mike", 2000.0);
		Account account2 = new Account(1478, "Hannah", 50.0);
		Account account3 = new Account(9632, "Bill", 500.0);

		Account[] accounts = new Account[3];
		accounts[0] = account1;
		accounts[1] = account2;
		accounts[2] = account3;

		System.out.println("\n Display tests from Part 2");
		account1.deposit(2000.0);
		account2.deposit(-2000.0);
		account3.withdraw(501.0);

		System.out.println("\n All Account Details");
		for (Account acct : accounts) {
			System.out.println(acct.getDetails());
		}

		System.out.println("\n Display tests from Part 3");

		// Part 3 - Step 3 & 4 Display Interest charges
		myAccount.addInterest();
		System.out.println("Balance after Part 3 Step 4 Testing addInterest");
		System.out.println(myAccount.getDetails());

		// Part 3 - Step 6 Create partnerAccount
		Account partnerAccount = myAccount;

		partnerAccount.addInterest();
		System.out.println("\n Display Part 3 Step 7 - Balance results after adding interest to partner account");
		System.out.println(myAccount.getDetails());

		// Part 3 - Step 9
		processAccount(myAccount);
		System.out.println("\n Display Part 3 Step 9 - Balance results after calling processAccount method");
		System.out.println(myAccount.getDetails());

		// Part 3 - Step 13
		int k = 100;
		System.out.println("\n Display Part 3 Step 13 - testing incInt method");
		System.out.println("Value of k before incInt(): " + k);
		incInt(k);
		System.out.println("Value of k after incInt(): " + k);

	}

	// Part 3 - Step 8 - Create processAccount Method
	static void processAccount(Account acc) {
		acc.addInterest();
	}

	// Part 3 - Step 12 - Create incInt method
	private static void incInt(int x) {
		x++;
	}

}
