package Com.task.Exceptions.Arith;

public class Calculator 
{
	static void calculate(int num1, int num2, String operator)
	{
		try 
		{
			int result = 0;
			
			switch (operator) 
			{
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				throw new InvalidOperatorException("Invalid operator provided");
			}
			
			if (result < 0) 
			{
				throw new NegativeResultException("Result is negative: " + result);
			}
			
		} 
		catch (NegativeResultException e  ) 
		{
			System.out.println("Negative Result : "+ e);

		}
		catch(InvalidOperatorException e)
		{
			System.out.println("Invalid Operator : "+ e);
			
		}

	}


}
