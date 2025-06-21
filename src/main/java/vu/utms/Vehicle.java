package vu.utms;

// Vehicle.java - Base class for all vehicles
public abstract class Vehicle {
    private String registrationNumber;
    private String make;
    private String model;
    private int year;
    private Driver assignedDriver;

    public Vehicle(String registrationNumber, String make, String model, int year) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getRegistrationNumber() { return registrationNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public Driver getAssignedDriver() { return assignedDriver; }

    // Setter methods
    public void setAssignedDriver(Driver driver) { this.assignedDriver = driver; }

    // Abstract method
    public abstract String getVehicleType();
}

