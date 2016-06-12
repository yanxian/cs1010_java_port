/**
 * Refer to : 
 * http://www.comp.nus.edu.sg/~cs1010/labs/2015s2/lab2/controlstructures.html
 * Exercise 2 for original Code and instructions
 *
 */
public class SquareFreeCalculator {
	
	//TODO : Write at least 1 other function to compute some results to complete the exercise

	public static void main(String[] args){
	
		int lower1 = 0;
		int upper1 = 0;
		int lower2 = 0;
		int upper2 = 0;
		StringBuilder sb;
		System.out.print("Enter four positive integers: ");
		
		//TODO : Make at least 1 function call to compute the number of square-free numbers 
		//TODO : Replace the variables below with the appropriate values 
		//TODO : Implement relevant control flow statements so that the correct block runs for the relevant case
		
		{
		int lowerWithMoreSqFreeNum = 0;
		int upperWithMoreSqFreeNum = 0;
		int numSquareFreeNumbers = 0;
		
		sb = new StringBuilder();
		sb.append("Range [");
		sb.append(lowerWithMoreSqFreeNum);
		sb.append(", ");
		sb.append(upperWithMoreSqFreeNum);
		sb.append("] has more square-free numbers: ");
		sb.append(numSquareFreeNumbers);
		System.out.println(sb.toString());
		}
		{
		int numSquareFreeNumbers  = 0;
		sb = new StringBuilder();
		sb.append("Both ranges have the same number of square-free numbers: ");
		sb.append(numSquareFreeNumbers);
		System.out.println(sb.toString());
		}
		
	}
}
