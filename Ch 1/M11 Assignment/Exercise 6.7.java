import java.util.Scanner;

public class Exercise06_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount invested (e.g., 1000): ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 9.5): ");
        double annualInterestRatePercentage = input.nextDouble();

        double annualInterestRate = annualInterestRatePercentage / 100.0;
        
        double monthlyInterestRate = annualInterestRate / 12.0;

        System.out.println("\nYears    Future Value");

        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(
                investmentAmount, 
                monthlyInterestRate, 
                year
            );

            System.out.printf("%-5d %15.2f\n", year, futureValue);
        }

        input.close();
    }

    public static double futureInvestmentValue(
            double investmentAmount, 
            double monthlyInterestRate, 
            int years) {
        
        int numberOfMonths = years * 12;
        
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
        
        return futureValue;
    }
}