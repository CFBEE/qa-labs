package lab03b_OOP2;

public class Vehicle {
	private static int count = 0;

	private int speed;
	private int lane;
	private int distanceTravelled;
	private RegistrationPlate registrationPlate;

	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		this.distanceTravelled = 0;
		this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
		count++;
	}

	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public int getLane() {
		return lane;
	}

	public static int getCount() {
		return count;
	}

	public void accelerate(int amount) {
		speed += amount;
		if (speed > 200) {
			speed = 200;
		}
		distanceTravelled += amount;
	}

	public void brake(int amount) {
		speed -= amount;
		if (speed < 0) {
			speed = 0;
		}
	}

	public String getDetails() {
		return "Vehicle[" + "speed=" + speed + ", lane=" + lane + ", distanceTravelled=" + distanceTravelled
				+ ", plate=" + registrationPlate.getNumber() + "]";

	}

}
