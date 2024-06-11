package project;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CollegeManagement {
    public void viewAssignedTeachers() {
        System.out.println("\nView Assigned Teachers");
        System.out.println("----------------------");
        System.out.println("Assigned teachers:\n Java - Dr. Shweta Singhal\nPhysics - Mrs.Poonam Kharangarh\nDBMS - Ms.Ritika Kumari");
    }

    public void viewSubjects() {
        System.out.println("\nView Subjects");
        System.out.println("--------------");
        System.out.println("Subjects:\nJava\nPhysics\nDBMS");
    }

    public void viewTimetable() {
        System.out.println("\nView Timetable");
        System.out.println("----------------");
        System.out.println("Timetable:\nMonday: Mathematics - 9:00 AM to 10:30 AM\nTuesday: Physics - 11:00 AM to 12:30 PM");
    }

    public void writeAssignedTeachersToFile() {
        try (FileWriter writer = new FileWriter("assigned_teachers.txt")) {
            writer.write("Java - Dr. Shweta Singhal\n");
            writer.write("Physics - Mrs. Poonam Kharangarh\n");
            writer.write("DBMS - Ms. Ritika Kumari\n");
            System.out.println("Assigned teachers written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing assigned teachers to file.");
        }
    }

    public void writeSubjectsToFile() {
        try (FileWriter writer = new FileWriter("subjects.txt")) {
            writer.write("Java\n");
            writer.write("Physics\n");
            writer.write("DBMS\n");
            System.out.println("Subjects written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing subjects to file.");
        }
    }

    public void writeTimetableToFile() {
        try (FileWriter writer = new FileWriter("timetable.txt")) {
            writer.write("Monday: Mathematics - 9:00 AM to 10:30 AM\n");
            writer.write("Tuesday: Physics - 11:00 AM to 12:30 PM\n");
            System.out.println("Timetable written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing timetable to file.");
        }
    }
}
