import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        double[] scores = new double[numberOfStudents];
        double best = 0;

        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextDouble();
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            char grade;

            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.printf("Student %d score: %.1f grade: %c%n", i, scores[i], grade);
        }

        input.close();
    }
}
