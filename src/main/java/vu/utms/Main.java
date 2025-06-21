package vu.utms;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create users
        Student student = new Student("Atwine", "SPICE06", "student@vu.edu", "S1001", "Computer Science");
        Lecturer lecturer = new Lecturer("profMubiru", "nemesis", "lecturer@vu.edu", "L2001", "Engineering");
        TransportOfficer officer = new TransportOfficer("officer1", "admin123", "transport@vu.edu", "T3001", "Day");

        // Create vehicles
        Bus campusBus = new Bus("VU100", "Mercedes", "Sprinter", 2020, 30);
        Van cargoVan = new Van("VU200", "Ford", "Transit", 2019, 500);

        // Create drivers
        Driver busDriver = new Driver("D100", "Walusimbi M", "DL12345", "Class B");
        Driver vanDriver = new Driver("D101", "Mulindwa A", "DL67890", "Class C");

        // Create transport system
        TransportManagementSystem tms = new TransportManagementSystem();

        // Demonstrate polymorphism
        System.out.println("=== Demonstrating Polymorphism ===");
        tms.processTransportRequest(student);
        tms.processTransportRequest(lecturer);
        tms.processTransportRequest(officer);

        // Demonstrate method overloading
        System.out.println("\n=== Demonstrating Method Overloading ===");
        tms.assignDriver(busDriver, campusBus);
        tms.assignDriver(vanDriver, "Van");
        tms.assignDriver(busDriver, "Morning", "Bus");

        // Demonstrate interface implementation
        System.out.println("\n=== Demonstrating Interface Implementation ===");
        campusBus.assignSchedule("8:00 AM - 5:00 PM");
        campusBus.updateLocation("Main Campus");
        campusBus.performMaintenance();

        cargoVan.updateLocation("Market Plaza");
        System.out.println("Van location: " + cargoVan.getCurrentLocation());

        // Demonstrate encapsulation
        System.out.println("\n=== Demonstrating Encapsulation ===");
        System.out.println("Student email (accessed via getter): " + student.getEmail());
        // student.password would not be accessible directly as it's private
    }
}