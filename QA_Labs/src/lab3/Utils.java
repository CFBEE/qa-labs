package lab3;

import java.util.Scanner;

public class Utils {

	static Scanner s = new Scanner(System.in);

	public int getInt(String prompt) {

		System.out.printf(prompt);
		return s.nextInt();
	}

	public String getString(String prompt) {

		System.out.printf(prompt);
		return s.nextLine();
	}

	public static void closeScanner() {
		s.close();
	}

}
