package vu.utms;

// Lcturer.java - Subclass of User
public class Lecturer extends User {
    private String staffId;
    private String department;

    public Lecturer(String username, String password, String email, String staffId, String department) {
        super(username, password, email);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getUsername() + " requested transport for department visit.");
    }

    // Lecturer-specific method
    public void requestSpecialTransport() {
        System.out.println("Requesting special transport for guest lecture...");
    }
}
