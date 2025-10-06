import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day (0-6): ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int futureDay = (today + elapsed) % 7;
 
        System.out.print("Today is ");
        if (today == 0)
            System.out.print("Sunday and ");
        else if (today == 1)
            System.out.print("Monday and ");
        else if (today == 2)
            System.out.print("Tuesday and ");
        else if (today == 3)
            System.out.print("Wednesday and ");
        else if (today == 4)
            System.out.print("Thursday and ");
        else if (today == 5)
            System.out.print("Friday and ");
        else if (today == 6)
            System.out.print("Saturday and ");

        System.out.print("the future day is ");
            if (futureDay == 0)
            System.out.println("Sunday");
        else if (futureDay == 1)
            System.out.println("Monday");
        else if (futureDay == 2)
            System.out.println("Tuesday");
        else if (futureDay == 3)
            System.out.println("Wednesday");
        else if (futureDay == 4)
            System.out.println("Thursday");
        else if (futureDay == 5)
            System.out.println("Friday");
        else if (futureDay == 6)
            System.out.println("Saturday");

    }
}