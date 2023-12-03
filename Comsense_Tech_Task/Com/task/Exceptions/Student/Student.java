package Com.task.Exceptions.Student;

// Created 'Student' Class to Make an array of students in "StudentMangement" Class
// with name and roll number

public class Student 
{
	private int studentRollNo;   // Roll No
	private String studentName;  // Name

	public Student() {
		super();
	}

	public Student(int studentRollNo, String studentName) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
	}
	
	

}
