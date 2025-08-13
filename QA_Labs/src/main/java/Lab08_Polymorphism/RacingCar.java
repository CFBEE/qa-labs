package main.java.Lab08_Polymorphism;

public class RacingCar extends Car {
    private String driver;
    private int turboFactor;

    // Constructor for 'RacingCar'
    public RacingCar(String model, String driver, int turboFactor) {
        super(model);
        setDriver(driver);
        setTurboFactor(turboFactor);
    }

    // update 'accelerate' method to include 'turboFactor'
    @Override
    public void accelerate(int seconds) {
        super.accelerate(seconds); // Base acceleration
        setSpeed(getSpeed() * turboFactor); // Apply turboFactor
    }

    // Getter and Setter for 'driver'
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        if (driver == null || driver.isBlank()) {
            throw new IllegalArgumentException("Driver cannot be null or blank");
        }
        this.driver = driver;
    }

    // Getter and Setter for 'turboFactor'
    public int getTurboFactor() {
        return turboFactor;
    }

    public void setTurboFactor(int turboFactor) {
        if (turboFactor <= 0) {
            throw new IllegalArgumentException("Turbo factor must be > 0");
        }
        this.turboFactor = turboFactor;
    }

    // Override output for 'RacingCar' class
    @Override
    public String toString() {
        return getModel() + " is being driven by " + driver + " and is racing at " + getSpeed() + " mph with a boost of " + turboFactor;
    }

}
