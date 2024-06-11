package project;
import java.util.*;
import java.util.Date;
import java.io.*;

public class ProfileManagementImpl implements ProfileManagement {
    private Student student;

    public ProfileManagementImpl(Student student) {
        this.student = student;
    }

    @Override
    public void viewProfile() throws InterruptedException{
        System.out.println("\nProfile Management");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Batch: " + student.getBatch());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Contact Number: " + student.getContactNumber());
        System.out.println("------------------");
        System.out.println("------------------");
        
        Thread.sleep(1500);
    }

    @Override
    public void editProfile() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select the profile field to edit:");
    System.out.println("1. Name");
    System.out.println("2. Roll Number");
    System.out.println("3. Department");
    System.out.println("4. Batch");
    System.out.println("5. Email");
    System.out.println("6. Contact Number");
    System.out.println("0. Go Back");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Enter new name: ");
            String newName = scanner.next();
            student.setName(newName);
            System.out.println("Name updated successfully!");
            break;
        case 2:
            System.out.println("Enter new roll number: ");
            String newRollNumber = scanner.next();
            student.setRollNumber(newRollNumber);
            System.out.println("Roll Number updated successfully!");
            break;
        case 3:
            System.out.println("Enter new department: ");
            String newDepartment = scanner.next();
            student.setDepartment(newDepartment);
            System.out.println("Department updated successfully!");
            break;
        case 4:
            System.out.println("Enter new batch: ");
            String newBatch = scanner.next();
            student.setBatch(newBatch);
            System.out.println("Batch updated successfully!");
            break;
        case 5:
            System.out.println("Enter new email: ");
            String newEmail = scanner.next();
            student.setEmail(newEmail);
            System.out.println("Email updated successfully!");
            break;
        case 6:
            System.out.println("Enter new contact number: ");
            String newContactNumber = scanner.next();
            student.setContactNumber(newContactNumber);
            System.out.println("Contact Number updated successfully!");
            break;
        case 0:
            System.out.println("No changes made. Going back to the main menu.");
            break;
        default:
            System.out.println("Invalid choice. No changes made.");
            break;
    }
    }
}
