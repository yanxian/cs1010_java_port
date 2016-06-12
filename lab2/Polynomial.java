

/**
 * 
 * A Polynomial of Type c0 + c1*x + c2*x^2 + c3*x^3 
 */
public class Polynomial {

	int c0;
	int c1;
	int c2;
	int c3;
	
	/**
	 * Wrapper Method To Create a Polynomial and evaluate the polynomial at 
	 * given x-value
	 * 
	 * @param x x-value to evaluate the function
	 * @param c0 constant of the polynomial
	 * @param c1 coefficient of the linear term in the polynomial
	 * @param c2 coefficient of the square term in the polynomial
	 * @param c3 coefficient of the cubic term in the polynomial
	 */
	public static double polynomial(double x, int c0, int c1, int c2, int c3){
		Polynomial p = new Polynomial(c0,c1,c2,c3);
		return p.computeValueAt(x);
	}
	
	//TODO: Implement at least 1 other static method to compute the roots given 2 endpoints
	//TODO: Write down a description for the method using the polynomial() method as an example
	//TODO: Write down any additional assumptions you make about the input 
	
	
	
	Polynomial(int c0, int c1, int c2, int c3){
		this.c0 = c0;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	//TODO: Write down a description of the following method using the polynomial() method as an example	
	public double computeValueAt(double x){
		//TODO: Evaluate the polynomial according to the above form with given x-value
		
		return 0.0;
	}
	
	public static void main(String[] args){
		
		System.out.print("Enter coefficients (c3,c2,c1,c0) of polynomial: ");
		//TODO: Capture the inputs, 
		//Note : You may refer Candle.java for an Example on how to do so.
		
		System.out.print("Enter endpoints a and b: ");
		//TODO: Capture the Inputs
		
		//TODO: Do your Computation Here
		
		System.out.print("root = ");
		//TODO: Print the x-value of the root here
		
		System.out.print("p(root) = ");
		//TODO: Print the value of the polynomial at the root here
		
	}
	
}
