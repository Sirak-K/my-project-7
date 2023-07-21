public class ReportsAndAverages {
    // Method to calculate the average score for a specific student
    public static double calculateAverageScore(StudentGrades student) {
        int[] grades = student.getGrades();
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to display student information and average score
    public static void displayStudentInfo(StudentGrades student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        int[] grades = student.getGrades();
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }
        double average = calculateAverageScore(student);
        System.out.println("Average Score: " + average);
        System.out.println("-------------------------------");
    }

    // Method to display reports for all students
    public static void generateReports(StudentGrades[] students) {
        System.out.println("---- Reports ----");
        for (StudentGrades student : students) {
            if (student != null) {
                displayStudentInfo(student);
            }
        }
    }
}
