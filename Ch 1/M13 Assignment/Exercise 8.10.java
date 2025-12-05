public class Exercise08_10 {
    public static void main(String[] args) {
        final int n = 4;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int rowIndex = 0;
        int rowSum = sumRow(matrix[0]);

        for (int i = 1; i < n; i++) {
            int currentSum = sumRow(matrix[i]);
            if (currentSum > rowSum) {
                rowSum = currentSum;
                rowIndex = i;
            }
        }

        System.out.println("The largest row index: " + rowIndex);

        int columnIndex = 0;
        int columnSum = sumColumn(matrix, 0);

        for (int i = 1; i < n; i++) {
            int currentSum = sumColumn(matrix, i);
            if (currentSum > columnSum) {
                columnSum = currentSum;
                columnIndex = i;
            }
        }

        System.out.println("The largest column index: " + columnIndex);
    }

    public static int sumRow(int[] row) {
        int sum = 0;
        for (int value : row)
            sum += value;
        return sum;
    }

    public static int sumColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
            sum += matrix[i][column];
        return sum;
    }
}
