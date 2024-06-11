package project;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    private static final String USERNAME = "Radhika";
    private static final String PASSWORD = "Gupta";

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        boolean correctPass = false;
        while (!correctPass) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                correctPass = true;
                System.out.println("Hello, student!\n");

                Student student = new Student("Radhika", "100", "CSAI", "2", "rg@gmail.com", "987978031");
                ProfileManagement profileManagement = new ProfileManagementImpl(student);
                AcademicManagement academicManagement = new AcademicManagement(student);
                CollegeManagement collegeManagement = new CollegeManagement();
                ExamProcess examProcess = new ExamProcess();
                Feedback feedback = new Feedback();

                displayOptions(student, profileManagement, academicManagement, collegeManagement, examProcess, feedback);
            } else {
                System.out.println("Invalid username or password. Please try again.\n");
            }
        }

        scanner.close();
    }

    private static void displayOptions(Student student, ProfileManagement profileManagement,
                                       AcademicManagement academicManagement, CollegeManagement collegeManagement,
                                       ExamProcess examProcess, Feedback feedback) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Profile Management");
            System.out.println("2. Exam Process");
            System.out.println("3. Academic Management");
            System.out.println("4. College Management");
            System.out.println("5. Feedback");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int profChoice;
                    System.out.println("Profile Management");
                    System.out.println("1: View Profile");
                    System.out.println("2: Edit Profile");
                    profChoice = scanner.nextInt();
                    switch (profChoice) {
                        case 1:
                            profileManagement.viewProfile();
                            break;
                        case 2:
                            profileManagement.editProfile();
                            break;
                    }
                    break;
                case 2:
                    int examChoice;
                    do {
                        System.out.println("Exam Process");
                        System.out.println("1. View Marks");
                        System.out.println("2. GEC Subject Registration");
                        System.out.println("3. Generate Admit Card");
                        System.out.println("4. Enter Marks");
                        System.out.println("0. Go Back");
                        System.out.print("Enter your choice: ");
                        examChoice = scanner.nextInt();

                        switch (examChoice) {
                            case 1:
                                examProcess.viewMarks();
                                break;
                            case 2:
                                System.out.print("Enter GEC subject: ");
                                String gecSubject = scanner.next();
                                examProcess.registerGECSubject(gecSubject);
                                break;
                            case 3:
                                examProcess.generateAdmitCard();
                                break;
                            case 4:
                                examProcess.enterMarks();
                                break;
                        }
                    } while (examChoice != 0);
                    break;
                case 3:
                    int academicChoice;
                    do {
                        System.out.println("Academic Management");
                        System.out.println("1. Register Semester");
                        System.out.println("2. Request Certificates");
                        System.out.println("3. View Exam Report");
                        System.out.println("0. Go Back");
                        System.out.print("Enter your choice: ");
                        academicChoice = scanner.nextInt();

                        switch (academicChoice) {
                            case 1:
                                academicManagement.registerSemester();
                                break;
                            case 2:
                                academicManagement.requestCertificates();
                                break;
                            case 3:
                                academicManagement.viewExamReport();
                                break;
                        }
                    } while (academicChoice != 0);
                    break;
                case 4:
                    int collegeChoice;
                    do {
                        System.out.println("College Management");
                        System.out.println("1. View Assigned Teachers");
                        System.out.println("2. View Subjects");
                        System.out.println("3. View Timetable");
                        System.out.println("0. Go Back");
                        System.out.print("Enter your choice: ");
                        collegeChoice = scanner.nextInt();

                        switch (collegeChoice) {
                            case 1:
                                collegeManagement.viewAssignedTeachers();
                                break;
                            case 2:
                                collegeManagement.viewSubjects();
                                break;
                            case 3:
                                collegeManagement.viewTimetable();
                                break;
                        }
                    } while (collegeChoice != 0);
                    break;
                case 5:
                    feedback.giveFeedback();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
