package project;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamProcess {
    private List<String> marks;

    public ExamProcess() {
        marks = new ArrayList<>();
        marks.add("Java: 90");
        marks.add("Physics: 85");
        marks.add("DBMS: 95");
        
    }

    public void viewMarks() {
        if (marks.isEmpty()) {
            System.out.println("No marks available.");
        } else {
            System.out.println("\nMarks");
            System.out.println("-----");
            for (String mark : marks) {
                System.out.println(mark);
            }
        }
    }

    public void registerGECSubject(String subject) throws InterruptedException {
        System.out.println("Registering........");
        Thread.sleep(2000);
        System.out.println("Registered for GEC subject: " + subject);
        Thread.sleep(500);
        
        // Write the certificate to a file
    String certificateLine = "Here is your GEC Certificate. Congratulations!";
    try (FileWriter writer = new FileWriter("GEC Certificate.txt")) {
        writer.write(certificateLine);
        System.out.println("GEC Certificate generated and written to file successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred while generating GEC Certificate.");
    }
    }

    public void generateAdmitCard() throws InterruptedException {
        System.out.println("Generating Admit card");
        Thread.sleep(2000);
        System.out.println("Admit card generated successfully.");
        Thread.sleep(500);
    }

    public void enterMarks() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in the format \"Subject:marks\" ");
        String mark = scanner.nextLine();
        marks.add(mark);
        System.out.println("Marks entered successfully.");
        Thread.sleep(500);

        // Write the marks to a file
        try (FileWriter writer = new FileWriter("marks.txt", true)) {
            writer.write(mark + "\n");
            System.out.println("Marks written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing marks to file.");
        }
    }

    public void readMarksFromFile() {
        try (FileReader reader = new FileReader("marks.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                marks.add(line);
            }
            System.out.println("Marks read from file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading marks from file.");
        }
    }
}
