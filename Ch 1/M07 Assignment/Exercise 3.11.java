import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
        String month = input.next();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int daysInMonth = 0;

        switch (month) {
            case "1": month = "January";
                daysInMonth = 31;
            break;
            case "2": month = "February"; 
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; 
                } else {
                    daysInMonth = 28;
                }
            break;
            case "3": month = "March"; 
                daysInMonth = 31;
            break;
            case "4": month = "April"; 
                daysInMonth = 30;    
            break;  
            case "5": month = "May"; 
                daysInMonth = 31;
            break;
            case "6": month = "June"; 
                daysInMonth = 30;
            break;
            case "7": month = "July"; 
                daysInMonth = 31;
            break;
            case "8": month = "August"; 
                daysInMonth = 31;
            break;
            case "9": month = "September"; 
                daysInMonth = 30;
            break;
            case "10": month = "October"; 
                daysInMonth = 31;
            break;
            case "11": month = "November"; 
                daysInMonth = 30;
            break;
            case "12": month = "December"; 
                daysInMonth = 31;
            break;
        }
        System.out.println(month + " " + year + " has " + daysInMonth + " days.");
    }
}  