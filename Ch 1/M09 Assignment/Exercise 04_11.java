import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        System.out.print("Enter a decimal value (0 to 15): ");
        Scanner input = new Scanner(System.in);
        int decimalValue = input.nextInt();
        if (decimalValue < 0 || decimalValue > 15) {
            System.out.println(decimalValue + "is an invalid input");
        } else {
            char hexChar = (decimalValue < 10) ? (char) (decimalValue + '0') : (char) (decimalValue - 10 + 'A');
            System.out.println("The hex value is " + hexChar);
        }
    }
}