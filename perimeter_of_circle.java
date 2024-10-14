// Java program to find
// the perimeter of the circle
// using radius

import java.io.*;

class GFG {

	static final double PI = Math.PI;

	// Function to calculate the
	// perimeter of the circle
	static double Perimeter(double r) 
	{ 
	return 2 * PI * r; 
	}

	// Driver code
	public static void main(String[] args)
	{

		// Radius
		double r = 5;

		// Calling Perimeter function
		System.out.println("Perimeter of the circle is :"
						+ Perimeter(r));
	}
}
