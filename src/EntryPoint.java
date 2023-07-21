import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
        // Initialize the necessary variables and objects
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Create an array to store student objects
        StudentGrades[] students = new StudentGrades[10]; // Assuming a maximum of 10 students

        // Load data from CSV file using FileHandler
        String csvFileName = "resources/student_grades_data.csv"; // Update the file path accordingly
        FileHandler.loadFromCSV(students, csvFileName);

        // Main menu loop
        do {
            // Display the main menu options
            System.out.println("---- Student Grade Management System ----");
            System.out.println("1. Calculate Average Score for a Student");
            System.out.println("2. Generate Reports for All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            // Read user input
            choice = scanner.nextInt();

            // Perform action based on user choice
            switch (choice) {
                case 1:
                    calculateAverageScore(scanner, students);
                    break;
                case 2:
                    generateReports(students);
                    break;
                case 3:
                    System.out.println("Exiting the Student Grade Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        // Close the scanner
        scanner.close();
    }

     // Method to calculate the average score for a specific student
    public static void calculateAverageScore(Scanner scanner, StudentGrades[] students) {
        // Prompt user for student's roll number
        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();

        // Find the corresponding student in the "students" array
        StudentGrades student = findStudentByRollNumber(students, rollNumber);

        if (student == null) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        } else {
            // Calculate and display their average score (rounded)
            int average = (int) Math.round(student.calculateAverage());
            System.out.println("Average score for student with roll number " + rollNumber + ": " + average);
        }
    }

    // Method to generate reports for all students
    public static void generateReports(StudentGrades[] students) {
        System.out.println("---- Reports ----");
        for (StudentGrades student : students) {
            if (student != null) {
                student.displayInfo();
                System.out.println("-------------------------------");
            }
        }
    }

    // Helper method to find a student by their roll number
    public static StudentGrades findStudentByRollNumber(StudentGrades[] students, int rollNumber) {
        for (StudentGrades student : students) {
            if (student != null && student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}
