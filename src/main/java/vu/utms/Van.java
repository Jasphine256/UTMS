package vu.utms;

// Van.java - Concrete vehicle class
public class Van extends Vehicle implements Serviceable, Trackable {
    private int cargoCapacity;
    private String currentLocation;
    private boolean needsService;

    public Van(String registrationNumber, String make, String model, int year, int cargoCapacity) {
        super(registrationNumber, make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String getVehicleType() { return "Van"; }

    // Serviceable implementation
    @Override
    public void performMaintenance() {
        System.out.println("Performing van maintenance...");
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
        System.out.println("Van location updated to: " + location);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
}
