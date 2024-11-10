package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	
	private String firstName, lastName, courses;
	private String studentID;
	private int gradeYear, feesBalance;
	private static int tuitionFee= 600;
	private static int id=1000;
	// create constructor with student name and year
	public Student() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first name:");
		firstName=sc.nextLine();
		System.out.println("Enter last name:");
		lastName=sc.nextLine();
		System.out.println("Enter grade year:");
		gradeYear=sc.nextInt();
		
		System.out.println(firstName+" "+lastName+" "+gradeYear);
		
	}
	
	//  create 5 digit id
	public String setStudentID() {
		id++;
		this.studentID=  gradeYear+""+id;
		return studentID;
	}
	
	//Enroll into courses
	
	
	//view balance
	
	
	//pay tution fee
	
	
	//view  status
	
}
