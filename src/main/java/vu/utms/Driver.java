ackage vu.utms;

// Driver.java
public class Driver {
    private String driverId;
    private String name;
    private String licenseNumber;
    private String licenseType;

    public Driver(String driverId, String name, String licenseNumber, String licenseType) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.licenseType = licenseType;
    }

    // Getter methods
    public String getDriverId() { return driverId; }
    public String getName() { return name; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getLicenseType() { return licenseType; }

    // Setter methods
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public void setLicenseType(String licenseType) { this.licenseType = licenseType; }
}
