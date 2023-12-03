/* 1. Exercise on Print patterns
 * 
 * Write a method to print each of following pattern using the nested loops
 * in a class called printPatterns. 
 * 
 * 010
 * 1010
 * 01010
 * 101010
 * 0101010
 * 10101010
 */

package Com.task;

import java.util.Scanner;

public class PrintPatternX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Number of rows :");

		// Getting Number of rows from input in Integer
		int rows = sc.nextInt();

		// Calling method to print pattern
		printPattern(rows);

		// Closing the Scanner
		sc.close();

	}

	private static void printPattern(int rows) 
	{
		
		// First loop for Number of Lines = rows 
		for (int x = 1; x <= rows; x++) 
		{
			// First place value of single line 
			// Which changes 0 or 1 According to even and odd line
			int FirstPlace = (x % 2 == 0) ? 1 : 0;
			
			
 
			// Second For loop for columns
			for (int j = 1; j <= x + 2; j++) 
			{
				// Printing 0 or 1
				System.out.print(FirstPlace);

				// Values Changes Every time According to "FirstPlace" value
				FirstPlace = 1 - FirstPlace;
			}

			
			// Next Line
			System.out.println();
		}
	}
}
