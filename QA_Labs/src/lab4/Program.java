// Exercise 1d - Java Basics - Arrays and Loops
package lab4;

public class Program {

	public static void main(String[] args) {
		// Part 1 - Getting Started

		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		String[] names = { "Bob", "Conor", "Richard", "Hannah", "Grace" };
		int[] marks = { 2, 95, 75, 60, 52 };

		// Write Tasks without built-in commands
		// Task 1: Write code to find the sum of every number in the array
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("Task 1 - Sum: " + sum);

		// Task 2: Find the average of the array
		double average = (double) sum / numbers.length;
		System.out.println("Task 2 - Average: " + average);

		// Task 3: Find the minimum value in the array
		int min = numbers[0];
		for (int num : numbers) {
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Task 3 - Minimum: " + min);

		// Task 4: Find the maximum value in the array
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Task 4 - Maximum: " + max);

		// Task 5: Find the index of value 0 in the array
		int zeroIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				zeroIndex = i;
				break;
			}
		}
		System.out.println("Task 5 - Index of 0: " + zeroIndex);

		// Part 2 - Calculate Student Grades
		for (int i = 0; i < marks.length; i++) {
			String grade = getGrade(marks[i]);
			System.out.println(names[i] + ": " + grade);
		}
	}

	// Part 2 - Calculate Student Grades
	public static String getGrade(int mark) {
		if (mark < 1 || mark > 100) {
			return "Error: marks must be between 1..100";
		} else if (mark > 70) {
			return "Distinction";
		} else if (mark > 60) {
			return "Merit";
		} else if (mark >= 50) {
			return "Pass";
		} else {
			return "Fail";
		}
	}

}
