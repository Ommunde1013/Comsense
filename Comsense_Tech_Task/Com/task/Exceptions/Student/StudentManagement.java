/*
 * 3. Exercise on Exception Handling
 * 
 * 1. Write a program in java to display the names and roll numbers
 * of students. Initialize respective array variables for 10 Students
 * 
 * Handle, ArrayIndexOutOfBondsException, so that any such problems 
 * does not cause illegal termination of the program 
 * 
 */


package Com.task.Exceptions.Student;

public class StudentManagement {

	public static void main(String[] args) 
	{
		Student [] studentArray = new Student [10];
		
		try 
		{
			Student student1 = new Student();
			
			student1.setStudentName("Ram");
			student1.setStudentRollNo(16);
			
			
			studentArray[15]  = student1;
			
			System.out.println(student1);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Index out of Bonds : " + e);
		}
		
		catch (Exception e)
		{
			System.out.println("Exception : "+ e);
		}
		

	}

}
