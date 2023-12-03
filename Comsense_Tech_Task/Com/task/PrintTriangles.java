/* 2. Exercise on PrintTriangles
 * 
 * Write a method to print each of following patterns 
 * using nested loop PrintTriangle class.
 * 
 *     1
 *    121
 *   12421
 *  1248421
 * 
 */

package Com.task;

import java.util.Scanner;

public class PrintTriangles 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Number of rows :");

		// Getting Number of rows from input in Integer
		int rows = sc.nextInt();

		// Calling method to print pattern
		printTringle(rows);

		// Closing the Scanner
		sc.close();
		

	}

	private static void printTringle(int rows) 
	{
		// First loop for Number of Lines = rows 
		for (int x = 0; x < rows; x++) 
		{
			
			// Printing Empty spaces
            for (int y = rows - x - 1; y > 0; y--) 
            {
                System.out.print("  "); // 2 Empty Spaces
            }

            
            // Logic for single row
            for (int y = 0; y <= x; y++) 
            {
            	// Increments According to 2^j 
                int num = (int) Math.pow(2, y); 
                
                System.out.print(num + " "); // And Prints Output
            }

            
            // Reverse logic for same row
            for (int y = x - 1; y >= 0; y--) 
            {
            	// Increments According to 2^j in reverse
                int num = (int) Math.pow(2, y);
                
                System.out.print(num + " "); // And Prints Output
            }
            
            // Next Line
            System.out.println();
        }
		
		
	}

}
