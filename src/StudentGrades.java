public class StudentGrades {
    // Attributes
    private String name;
    private int rollNumber;
    private int[] grades;

    // Constructor
    public StudentGrades(String name, int rollNumber, int[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }

    // Methods for setting and retrieving student details
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int[] getGrades() {
        return grades;
    }

    // Method to calculate the average score of a student
    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to set grades for a student
    public void setGrades(int grade1, int grade2, int grade3) {
        if (grades.length == 3) {
            grades[0] = grade1;
            grades[1] = grade2;
            grades[2] = grade3;
        } else {
            System.out.println("Invalid operation. Grades array size must be 3.");
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }
    }
}
