import java.util.Arrays;

public class Exercise08_03 {
    public static void main(String[] args) {

        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentScores = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            studentScores[i][0] = i;            
            studentScores[i][1] = correctCount; 
        }

        Arrays.sort(studentScores, (a, b) -> Integer.compare(a[1], b[1]));

        for (int[] s : studentScores) {
            System.out.println("Student " + s[0] + ": " + s[1]);
        }

        double sum = 0;
        for (int[] s : studentScores) sum += s[1];
        double mean = sum / studentScores.length;

        double varianceSum = 0;
        for (int[] s : studentScores) varianceSum += Math.pow(s[1] - mean, 2);
        double deviation = Math.sqrt(varianceSum / studentScores.length);

        System.out.println("Mean is " + mean);
        System.out.println("Deviation is " + deviation);
    }
}
