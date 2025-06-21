package vu.utms;

// Student.java - Sub-class of User
public class Student extends User {
    private String studentId;
    private String course;

    public Student(String username, String password, String email, String studentId, String course) {
        super(username, password, email);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getUsername() + " requested transport for campus shuttle.");
    }

    
    // Student specific method 
    public void checkSchedule() {
        System.out.println("Checking student transport schedule...");
    }
}


