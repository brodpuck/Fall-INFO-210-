import java.util.Scanner;

public class Exercise07_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] names = new String[n];
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a student name: ");
            names[i] = input.next();

            System.out.print("Enter a student score: ");
            scores[i] = input.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[i]) {
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("Names in decreasing order of their scores are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }
    }
}
