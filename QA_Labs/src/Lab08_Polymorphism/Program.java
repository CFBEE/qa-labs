package Lab08_Polymorphism;

public class Program {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW 120d"),
                new Car("Ford Mondeo"),
                new RacingCar("Ferrari 458", "Mike", 2),
                new RacingCar("Porsche 911", "Conor", 3)
        };

        processCars(cars);
    }

    public static void processCars(Car[] cars) {
        for (Car c : cars) {
            c.getToSixty();           // Set to 60 MPH baseline
            c.accelerate(2);  // Accelerate for 2 seconds
            System.out.println(c.toString());    // Display car details
            if (c instanceof RacingCar rc) {
                rc.toString();
            }
            System.out.println(); // Add space between car outputs
        }
    }
}
