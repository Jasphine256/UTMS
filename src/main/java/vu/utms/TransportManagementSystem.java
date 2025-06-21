package vu.utms;

// TransportManagementSystem.java
public class TransportManagementSystem {
    // Overloaded assignDriver methods
    public void assignDriver(Driver driver, Vehicle vehicle) {
        vehicle.setAssignedDriver(driver);
        System.out.println("Driver " + driver.getName() + " assigned to vehicle " +
                vehicle.getRegistrationNumber());
    }

    public void assignDriver(Driver driver, String vehicleType) {
        System.out.println("Driver " + driver.getName() + " assigned to " +
                vehicleType + " (type-based assignment)");
    }

    public void assignDriver(Driver driver, String shiftTime, String vehicleType) {
        System.out.println("Driver " + driver.getName() + " assigned to " +
                vehicleType + " for " + shiftTime + " shift");
    }

    // Method to demonstrate polymorphism
    public void processTransportRequest(User user) {
        user.requestTransport();
    }
}
