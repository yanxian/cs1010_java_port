import java.util.Scanner;

/**
 * Refer to : 
 * http://www.comp.nus.edu.sg/~cs1010/labs/2015s2/lab2/controlstructures.html
 * Ex1 for original Code and instructions
 *
 */
public class Candle {
	
	/**
	 * Ex1 : Candles
	 * 	 
	 *  Alexandra has n candles. He burns them one at a time and carefully collects all unburnt residual wax. 
	 *  Out of the residual wax of exactly k (where k > 1) candles, he can roll out a new candle.
	 *  Help Alexandra find out how many candles he can burn in total.
	 *  
	 *  NOTE: Original Method is called count_candles() but renamed here due to differences in coding standards between c and java  
	 * 
	 * @param numCandles : number of candles at the start
	 * @param numResiduesRequired : number of candle residues required to make a new candle 
	 * @return total number of candles that can be burned including those made from residues 
	 */
	public static int countCandles(int numCandles, int numResiduesRequired)
	{
		//TODO : Implement a method to calculate the total number of candles that can be burned including those made from residues 
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of candles and " +
						"number of residuals to make a new candle: ");
		
		int numCandles = sc.nextInt();
		int numResiduesRequired = sc.nextInt();
		
		int totalCandlesBurnt = Candle.countCandles(numCandles, numResiduesRequired);
		System.out.println("Total candles burnt = "+ totalCandlesBurnt);
		
	}
}
