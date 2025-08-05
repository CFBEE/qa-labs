package lab6;

public class Program {
	public static void main(String[] args) {

		account();
	}

	public static void account() {
		double initialMoney = 100.0;
		double currentMoney = initialMoney;
		double interestRate = 0.05;
		int years = 0;

		while (currentMoney < 200.0) {
			currentMoney += currentMoney * interestRate;
			years++;
		}

		System.out.println("It takes " + years + " years to reach £200.");
	}

}
