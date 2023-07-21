import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    // Method to load student information from a .csv file
    public static void loadFromCSV(StudentGrades[] students, String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null && count < students.length) {
                String[] data = line.split(",");
                int rollNumber = Integer.parseInt(data[0]);
                String name = data[1];
                int[] grades = new int[3];

                grades[0] = Integer.parseInt(data[2]);
                grades[1] = Integer.parseInt(data[3]);
                grades[2] = Integer.parseInt(data[4]);

                students[count++] = new StudentGrades(name, rollNumber, grades);
            }

            bufferedReader.close();
            System.out.println("Data loaded from " + fileName + " successfully!");
        } catch (IOException e) {
            System.out.println("Error loading data from " + fileName);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid data format in " + fileName);
            e.printStackTrace();
        }
    }
}
