import java.util.Scanner;
  
public class Exercise03_19 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter three edges (length in double): ");
    double edge1 = input.nextDouble();
    double edge2 = input.nextDouble();
    double edge3 = input.nextDouble();
    
    boolean isValid = (edge1 + edge2 > edge3) &&
      (edge2 + edge3 > edge1) &&
      (edge1 + edge3 > edge2);

    if (isValid) {
      double s = (edge1 + edge2 + edge3);
      System.out.println("The perimeter is " + s); }
    else {
      System.out.println("The input is invalid");
    }
  }
}
