import java.util.Scanner;

public class InterestCalculator {

	public static double calculateCompoundInterest(double principalAmt, double interestRate, int numYears){
		//TODO: Calculate Compound Interest Accumulated here. 
		return 0.0;
	}
	
	public static void main(String[] args){
		
		InterestCalculator calc = new InterestCalculator();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter principal amount:\t");
		double rawPrincipalAmount = scanner.nextDouble();
		
		System.out.print("Enter interest rate:\t");
		//TODO: Capture Interest Rate here
		
		System.out.print("Enter number of years:\t");
		//TODO: Capture Number of Years Here
		
		double calculatedAnswer = calc.calculateCompoundInterest(0, 0, 0);
		
		//TODO: Print out Calculated Answer Here
	}
}
