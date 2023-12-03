package Com.task.Exceptions.DateException;

public class MyDate 
{
	private int day;
	private int month;
	private int year;

	public MyDate() 
	{
		super();
	}

	public MyDate(int day, int month, int year)
	{
		try 
		{
			// Year
			if (year > 1800 && year <= 9999) 
			{
				this.year = year;
			} 
			else 
			{
				System.out.println("Invalid Date");
				throw new Exception("Enter Valid Year in Range 1800 to 9999");
			}
			
			

			// Month
			if (month > 0 && month <= 12) 
			{
				this.month = month;
			} 
			else 
			{
				System.out.println("Invalid Date");
				throw new InvalidMonthException("Enter Valid Month 1 - 12");
			}

			// Day
			if (day >= 1 && day <= 31) 
			{
				if (month == 2) 
				{
					boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
					
					if (isLeap && day > 29) 
					{
						System.out.println("Invalid Date");
						throw new InvalidDayException("Invalid day for February in a leap year");
					} 
					else if (!isLeap && day > 28) 
					{
						System.out.println("Invalid Date");
						throw new InvalidDayException("Invalid day for February in a non-leap year");
					}
					
				} 
				
				else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) 
				{
					System.out.println("Invalid Date");
					throw new InvalidDayException("Invalid day for the given month");
				}
				
				this.day = day;
				System.out.println("Valid Date");

				
			} 
			else 
			{
				System.out.println("Invalid Date");
				throw new InvalidDayException("Enter a valid day between 1 and 31");
			}

		}

		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
