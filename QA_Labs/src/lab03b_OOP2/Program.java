package lab03b_OOP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Vehicle(50, 1));
		vehicles.add(new Vehicle(80, 2));
		vehicles.add(new Vehicle(120, 3));

		List<String> drivers = Arrays.asList("Conor", "Dave", "Mike");

		Random rand = new Random();
		boolean winnerFound = false;

		while (!winnerFound) {
			for (int i = 0; i < vehicles.size(); i++) {
				Vehicle v = vehicles.get(i);
				int n = rand.nextInt(10) + 1;
				v.accelerate(n);

				System.out.printf("%s: %s%n", drivers.get(i), v.getDetails());

				if (v.getDistanceTravelled() >= 1000) {
					System.out.printf("🏁 Winner: %s (lane %d) – travelled %d m%n", drivers.get(i), v.getLane(),
							v.getDistanceTravelled());
					winnerFound = true;
					break;
				}
			}

		}

		// Print out each vehicle's details
		for (Vehicle v : vehicles) {
			System.out.println(v.getDetails());
		}

		System.out.println("Total vehicles created: " + Vehicle.getCount());
	}

}
