public class Exercise04_03 {
 public static void main(String[] args) {
 
    double atlantaX = 33.7489954;
    double atlantaY = -84.3879824;
    double orlandoX = 28.5383355;
    double orlandoY = -81.3792365;
    double savannahX = 32.0835407;
    double savannahY = -81.0998342;
    double CharlotteX = 35.2270869;
    double CharlotteY = -80.8431267;
 
    atlantaX = Math.toRadians(atlantaX);
    atlantaY = Math.toRadians(atlantaY);
    orlandoX = Math.toRadians(orlandoX);
    orlandoY = Math.toRadians(orlandoY);
    savannahX = Math.toRadians(savannahX);
    savannahY = Math.toRadians(savannahY);
    CharlotteX = Math.toRadians(CharlotteX);
    CharlotteY = Math.toRadians(CharlotteY);

    double aox = atlantaX - orlandoX;
    double aoy = atlantaY - orlandoY;
    double osx = orlandoX - savannahX;
    double osy = orlandoY - savannahY;
    double sax = savannahX - atlantaX;
    double say = savannahY - atlantaY;
    
    double acx = atlantaX - CharlotteX;
    double acy = atlantaY - CharlotteY;
    double csx = CharlotteX - savannahX;
    double csy = CharlotteY - savannahY;

    double radius = 6371.01;
    double a = Math.pow(Math.sin(aox / 2), 2) + Math.cos(atlantaX) * Math.cos(orlandoX) * Math.pow(Math.sin(aoy / 2), 2);
    double b = Math.pow(Math.sin(osx / 2), 2) + Math.cos(orlandoX) * Math.cos(savannahX) * Math.pow(Math.sin(osy / 2), 2);
    double c = Math.pow(Math.sin(sax / 2), 2) + Math.cos(savannahX) * Math.cos(atlantaX) * Math.pow(Math.sin(say / 2), 2);

    double t = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double side1 = radius * t;
    t = 2 * Math.atan2(Math.sqrt(b), Math.sqrt(1 - b));
    double side2 = radius * t;
    t = 2 * Math.atan2(Math.sqrt(c), Math.sqrt(1 - c));
    double side3 = radius * t;

  double s = (side1 + side2 + side3) / 2;
  double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 
    a = Math.pow(Math.sin(acx / 2), 2) + Math.cos(atlantaX) * Math.cos(CharlotteX) * Math.pow(Math.sin(acy / 2), 2);
    b = Math.pow(Math.sin(csx / 2), 2) + Math.cos(CharlotteX) * Math.cos(savannahX) * Math.pow(Math.sin(csy / 2), 2);
    c = Math.pow(Math.sin(sax / 2), 2) + Math.cos(savannahX) * Math.cos(atlantaX) * Math.pow(Math.sin(say / 2), 2);
    t = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    side1 = radius * t;
    t = 2 * Math.atan2(Math.sqrt(b), Math.sqrt(1 - b));
    side2 = radius * t;
    t = 2 * Math.atan2(Math.sqrt(c), Math.sqrt(1 - c));
    side3 = radius * t;

    s = (side1 + side2 + side3) / 2;
    area = area + Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 
 
  System.out.print("The area is " + area + " square kilometers");
 
 }
 
}