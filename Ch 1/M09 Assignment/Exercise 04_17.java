import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        int daysInMonth;
        switch (month) {
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec":
                daysInMonth = 31;
                break;
            case "Apr", "Jun", "Sep", "Nov":
                daysInMonth = 30;
                break;
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println(month + " is not a correct month name");
                return;
        }
            System.out.println(month + " " + year + " has " + daysInMonth + " days");
        
    }
}