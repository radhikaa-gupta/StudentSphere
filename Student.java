package project;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String rollNumber;
    private String department;
    private String batch;
    private String email;
    private String contactNumber;

    public Student(String name, String rollNumber, String department, String batch, String email, String contactNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.batch = batch;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
