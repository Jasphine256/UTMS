package vu.utms;

// TransportOfficer.java - Subclass of User
public class TransportOfficer extends User {
    private String officerId;
    private String shift;

    public TransportOfficer(String username, String password, String email, String officerId, String shift) {
        super(username, password, email);
        this.officerId = officerId;
        this.shift = shift;
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport officer " + getUsername() + " requested vehicle for inspection.");
    }

    // Officer-specific method
    public void manageRoutes() {
        System.out.println("Managing transport routes...");
    }
}
