public class Exercise06_01 {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        final int MAX_COUNT = 100;

        for (int i = 1; i <= MAX_COUNT; i++) {
            int pentagonal = getPentagonalNumber(i);

            System.out.printf("%7d", pentagonal);

            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}