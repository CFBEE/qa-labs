package main.java.Lab08_Polymorphism;

public class Car {
    private String model;
    private int speed;

    // Constructor for 'Car'
    public Car(String model) {
        setModel(model);
        this.speed = 0;
    }

    // Getter and Setter for 'model'
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank");
        }
        this.model = model;
    }

    // Getter and Setter for 'speed'
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) throw new IllegalArgumentException("Speed must be >= 0");
        this.speed = speed;
    }

    // 'getToSixty' method
    public void getToSixty() {
        this.speed = 60;
    }

    // 'accelerate' method
    public void accelerate(int seconds) {
        if (seconds < 0) throw new IllegalArgumentException("Seconds must be >= 0");
        speed += 5 * seconds;
    }

    // Override output for 'Car' class
    @Override
    public String toString() {
        return model + " is travelling at " + speed + " mph";
    }
}

