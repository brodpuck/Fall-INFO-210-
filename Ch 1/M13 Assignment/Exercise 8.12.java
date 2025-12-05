import java.util.Scanner;

public class Exercise08_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(
			"(0-single filer, 1-married jointly,\n" +
			"2-married separately, 3-head of household)\n" +
			"Enter the filing status: ");
		int status = input.nextInt();

		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		if (status >= 0 && status <= 3)
  		System.out.println("Tax is " +
  			(int)(computeTax(status, income) * 100) / 100.0);
		else
		  System.out.println("Error: invalid input");
	}

	public static double computeTax(int status, double income) {
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		int[][] brackets = {
				  {8350, 33950, 82250, 171550, 372950},   
				  {16700, 67900, 137050, 20885, 372950}, 
				  {8350, 33950, 68525, 104425, 186475},
				  {11950, 45500, 117450, 190200, 372950} 
				};

		double tax = 0; 

		if (income <= brackets[status][0])
			return tax = income * rates[0];
		else
			tax = brackets[status][0] * rates[0];

		for (int i = 1; i < brackets[0].length; i++) {
			if (income > brackets[status][i])
				tax += (brackets[status][i] - brackets[status][i - 1]) *
					rates[i];
			else {
				tax += (income - brackets[status][i - 1]) * rates[i];
				return tax; 
			}
		}

		return  tax += (income - brackets[status][4]) * rates[5];
	}
}
