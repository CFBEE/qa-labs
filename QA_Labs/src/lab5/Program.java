package lab5;

public class Program {

	public static void main(String[] args) {
		multiplicationTable();
	}

	public static void multiplicationTable() {
		for (int row = 1; row <= 10; row++) { // Outer Loop for rows
			for (int col = 1; col <= 10; col++) { // Inner Loop for columns
				System.out.printf("%5d", row * col);
			}
			System.out.println(); // Move to the next line after each row
		}
	}

}
