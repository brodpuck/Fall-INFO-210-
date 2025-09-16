public class Exercise01_11 {
  public static void main(String[] args) {
    double population = 312032486;
    double secondsperyear = 365 * 24 * 60 * 60;
    double birthsperyear = secondsperyear / 7;
    double deathsperyear = secondsperyear / 13;
    double immigrant =  secondsperyear / 45;
    double Y1 = population + birthsperyear - deathsperyear + immigrant;    
    double Y2 = population + 2 * (birthsperyear - deathsperyear + immigrant);  
    double Y3 = population + 3 * (birthsperyear - deathsperyear + immigrant);   
    double Y4 = population + 4 * (birthsperyear - deathsperyear + immigrant);   
    double Y5 = population + 5 * (birthsperyear - deathsperyear + immigrant);
    System.out.print("Population after 1 year: ");
    System.out.println(Y1);
    System.out.print("Population after 2 years: ");
    System.out.println(Y2);
    System.out.print("Population after 3 years: ");
    System.out.println(Y3);
    System.out.print("Population after 4 years: ");
    System.out.println(Y4);
    System.out.print("Population after 5 years: ");
    System.out.println(Y5);
  }
}
