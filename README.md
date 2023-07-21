# Student Grade Management System

## Table of Contents

- [Student Grade Management System](#student-grade-management-system)
  - [Table of Contents](#table-of-contents)
  - [Project Description](#project-description)
  - [Features](#features)
  - [How to Install](#how-to-install)
  - [How to Use](#how-to-use)
  - [Implementation Details](#implementation-details)
    - [StudentGrades Class](#studentgrades-class)
    - [FileHandler Class](#filehandler-class)
    - [ReportsAndAverages Class](#reportsandaverages-class)
  - [Technologies Used](#technologies-used)
  - [License](#license)
  - [Contact](#contact)

## Project Description

The Student Grade Management System is a Java-based application that allows users to manage and calculate average scores for a group of students. The application loads student information from a CSV file, calculates the average score for each student, and generates reports displaying student information along with their average scores.

## Features

- Load student information from a CSV file.
- Calculate the average score for a specific student, rounded to the nearest integer.
- Generate reports displaying student information and rounded average scores for all students.

## How to Install

1. Ensure you have Java installed on your computer.
2. Clone this repository to your local machine using the following command:
   ```
   git clone https://github.com/Sirak-K/my-project-7.git
   ```
   If you prefer, you can also download the ZIP file of the repository by clicking on the "Code" button on this page and then selecting "Download ZIP."

## How to Use

1. Compile the Java files using the following command in the project root directory:
   ```
   javac -d bin src/*.java
   ```
2. Ensure you have a CSV file named `student_grades_data.csv` in the `resources` folder. The CSV file should contain student data in the format:
   ```
   RollNumber,Name,Grade1,Grade2,Grade3
   ```
   For example:
   ```
   5,Eric,94,77,43
   2,Betty,88,44,74
   10,Joaquin,82,48,38
   ...
   ```
3. Run the program using the following command:
   ```
   java -cp bin EntryPoint
   ```
4. The program will display a menu with options to:
   - Calculate the average score for a specific student by entering the student's roll number.
   - Generate reports displaying student information and rounded average scores for all students.
   - Exit the Student Grade Management System.

## Implementation Details

### StudentGrades Class

The `StudentGrades` class represents a student and contains the following attributes and methods:

- Attributes:
  - `name`: The name of the student (String).
  - `rollNumber`: The roll number of the student (int).
  - `grades`: An array of three integers representing the grades for three subjects.

- Constructor:
  - `StudentGrades(String name, int rollNumber, int[] grades)`: Constructs a `StudentGrades` object with the given name, roll number, and grades.

- Methods:
  - `getName()`: Returns the name of the student.
  - `getRollNumber()`: Returns the roll number of the student.
  - `getGrades()`: Returns the grades of the student as an array.
  - `calculateAverage()`: Calculates the average score of the student based on their grades.
  - `setGrades(int grade1, int grade2, int grade3)`: Sets the grades for the student's three subjects.
  - `displayInfo()`: Displays the student's name, roll number, and grades.

### FileHandler Class

The `FileHandler` class provides a method to load student information from a CSV file:

- Method:
  - `loadFromCSV(StudentGrades[] students, String fileName)`: Loads student information from the specified CSV file and populates the `students` array.

### ReportsAndAverages Class

The `ReportsAndAverages` class provides methods to calculate the average score for a specific student and generate reports for all students:

- Methods:
  - `calculateAverageScore(StudentGrades student)`: Calculates the average score for a specific student.
  - `displayStudentInfo(StudentGrades student)`: Displays the student's information and average score.
  - `generateReports(StudentGrades[] students)`: Generates reports for all students, displaying their information and rounded average scores.

## Technologies Used

- Java

## License

This project is licensed under the MIT License.

## Contact

For any questions or feedback, please contact [sirak.dev@gmail.com](mailto:sirak.dev@gmail.com).