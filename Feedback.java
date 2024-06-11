package project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Feedback {
    public void giveFeedback() {
        System.out.println("\nGive Feedback");
        System.out.println("--------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your feedback: ");
        String feedback = scanner.nextLine();

        // Write the feedback to a file
        try (FileWriter writer = new FileWriter("feedback.txt")) {
            writer.write(feedback);
            System.out.println("Thank you for your feedback!");
            System.out.println("Feedback written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing feedback to file.");
        }
    }
}
