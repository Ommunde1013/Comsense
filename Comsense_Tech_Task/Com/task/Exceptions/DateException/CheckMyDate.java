/*
 * 3. Exercise on Exception Handling
 * 
 * 1. Define a class MyDate with members as day, month, and year. 
 * Also, define default and parameterized constructors. Accept 
 * values from the command line and create a date object. Throw 
 * user defined exceptions Invalid DayException or InvalidMonthException 
 * if the day and month are invalid. If the date is valid, then display 
 * message Valid date.
 */

package Com.task.Exceptions.DateException;

public class CheckMyDate 
{

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Day: ");
//		int day = sc.nextInt();
//
//		System.out.print("Month");
//		int month = sc.nextInt();
//
//		System.out.print("Year: ");
//		int year = sc.nextInt();

		try 
		{
			MyDate date1 = new MyDate(12,01,2020);
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
