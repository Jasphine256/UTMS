package vu.utms;

// User.java - Abstract base class for all users
public abstract class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getter methods
    public String getUsername() { return username; }
    public String getEmail() { return email; }

    // Setter methods
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }

    // Abstract method to be implemented by subclasses
    public abstract void requestTransport();

    // Common method for all users
    public void login() {
        System.out.println(username + " logged in successfully.");
    }
}

