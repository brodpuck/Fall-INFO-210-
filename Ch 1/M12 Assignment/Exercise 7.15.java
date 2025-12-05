import java.util.Scanner;

public class Exercise07_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(numbers);

        System.out.println("The number of distinct integers is " + distinct.length);

        System.out.print("The distinct integers are ");
        for (int num : distinct) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int value : list) {
            if (!contains(temp, count, value)) {
                temp[count] = value;
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static boolean contains(int[] array, int count, int value) {
        for (int i = 0; i < count; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
