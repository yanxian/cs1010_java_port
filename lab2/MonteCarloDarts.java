import java.util.Scanner;

/**
 * Refer to : 
 * http://www.comp.nus.edu.sg/~cs1010/labs/2015s2/lab2/controlstructures.html
 * Exericse 4 for original Code and instructions
 *
 *	Useful References : 
 *  Java Random Number Generator : https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#random()
 */
public class MonteCarloDarts {

	/**
	 * Randomly Generates totalDarts number of (x,y) values which represent where the dart hits
	 * where 0 <= x <= 1 && 0 <= y <= 1 and 
	 * find the number of (x,y) pairs that satisfy x^2 + y^2 <= 1
	 * 
	 * @param totalDarts number of darts to throw
	 * @return number of darts that fall within the unit circle
	 */
	public static int throwDarts(int totalDarts){
		
		//TODO: Implement Method as Described
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many darts? ");
		int totalDarts = sc.nextInt();

		int dartsInside = MonteCarloDarts.throwDarts(totalDarts);
		System.out.print("Darts landed inside unit circle's quadrant = " + dartsInside);
		
		double approxPi = (double) dartsInside / (double) totalDarts;
		//TODO : Round approxPi to 4 decimal Place
		System.out.println("Approximated pi = " + approxPi);
	}

}
