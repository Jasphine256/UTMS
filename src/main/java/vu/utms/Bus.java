package vu.utms;

// Bus.java - Concrete vehicle class
public class Bus extends Vehicle implements Serviceable, Trackable, Schedulable {
    private int passengerCapacity;
    private String currentLocation;
    private String schedule;
    private boolean needsService;

    public Bus(String registrationNumber, String make, String model, int year, int passengerCapacity) {
        super(registrationNumber, make, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String getVehicleType() { return "Bus"; }

    // Serviceable implementation
    @Override
    public void performMaintenance() {
        System.out.println("Performing bus maintenance...");
        needsService = false;
    }

    @Override
    public boolean isDueForService() {
        return needsService;
    }

    // Trackable implementation
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
        System.out.println("Bus location updated to: " + location);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Schedulable implementation
    @Override
    public void assignSchedule(String schedule) {
        this.schedule = schedule;
        System.out.println("Bus assigned to schedule: " + schedule);
    }

    @Override
    public String getCurrentSchedule() {
        return schedule;
    }
}
