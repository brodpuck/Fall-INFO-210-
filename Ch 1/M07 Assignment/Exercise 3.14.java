import java.util.Scanner;
  
public class Exercise03_14 {
  public static void main(String[] args) {

    int number = (int)(Math.random() * 2);

    Scanner input = new Scanner(System.in);
    System.out.print("Guess head or tail? " +
      "Enter 0 for head and 1 for tail: ");
    int guess = input.nextInt();

    if (guess == number)
      System.out.println("Correct guess");
    else if (number == 0)
      System.out.println("Sorry, it is a head");
    else
      System.out.println("Sorry, it is a tail");
  }
}
