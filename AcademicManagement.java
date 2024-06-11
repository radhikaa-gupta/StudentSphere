package project;

import java.io.*;
import java.util.Scanner;

public class AcademicManagement {
    private Student student;

    public AcademicManagement(Student student) {
        this.student = student;
    }

    public void registerSemester() throws InterruptedException {
        System.out.println("\nRegister Semester");
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter semester number: ");
        int semesterNumber = scanner.nextInt();

        // Write the registered semester number to a file
        try (FileWriter writer = new FileWriter("semester.txt")) {
            writer.write(Integer.toString(semesterNumber));
            System.out.println("Semester " + semesterNumber + " registered successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while registering the semester.");
        }

        Thread.sleep(1000);
    }

    public void requestCertificates() throws InterruptedException {
        System.out.println("\nRequest Certificates");
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter certificate type: ");
        String certificateType = scanner.nextLine();

        // Write the certificate request to a file
        try (FileWriter writer = new FileWriter("certificates.txt")) {
            writer.write(certificateType);
            System.out.println("Certificate request for " + certificateType + " submitted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while submitting the certificate request.");
        }

        Thread.sleep(2000);
    }

    public void viewExamReport() throws InterruptedException {
        System.out.println("\nView Exam Report");
        System.out.println("----------------");

        // Read and display the exam report from a file
        try (FileReader reader = new FileReader("exam_report.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while viewing the exam report.");
        }

        Thread.sleep(2000);
    }
}
