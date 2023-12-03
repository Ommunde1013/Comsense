package Com.task.Exceptions.Arith;

import java.util.Arrays;
import java.util.Scanner;

public class CheckExpression 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		try 
		{
			System.out.print("Enter two numbers and separated by a space: ");
			String input = scanner.nextLine();
			String[] inputArray = input.split(" ");
			
			System.out.println(inputArray.length +"\n"+ Arrays.toString(inputArray) );

			if (inputArray.length < 3) 
			{
				throw new IllegalNumberOfArguments("Insufficient number of arguments provided");
			}

			int num1 = Integer.parseInt(inputArray[0]);
			int num2 = Integer.parseInt(inputArray[2]);

			String operator = inputArray[1];
			
			if (!operator.matches("[+\\-*/]")) 
			{
                throw new InvalidOperatorException("Invalid operator provided");
            }

			Calculator.calculate(num1, num2, operator);

		}

		catch (IllegalNumberOfArguments | InvalidOperatorException  e) 
		{
			System.err.println(e.getMessage());
		}
		
		finally 
		{
			scanner.close();
			
		}
	}

	
}


