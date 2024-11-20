package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	
	private String firstName, lastName, courses="";
	private String studentID;
	private int gradeYear, feesBalance;
	private static int courseFee= 600;
	private static int id=1000;
	// create constructor with student name and year
	public Student() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first name:");
		firstName=sc.nextLine();
		System.out.print("Enter last name:");
		lastName=sc.nextLine();
		System.out.println("1) Freshmen \n2)Sophomore \n3) Junior \n4)Senior \nEnter grade year:");
		gradeYear=sc.nextInt();
		
		setStudentID();
		//System.out.println(firstName+" "+lastName+" "+studentID);
		
		
	}
	
	//  create 5 digit id
	public String setStudentID() {
		id++; 
		this.studentID=  gradeYear+""+id;
		return studentID;
	}
	
	//Enroll into courses
	public void enroll(){
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.print("Enter course name(Q for Quit) :");
			String course= sc.nextLine();
			
			if(!course.equals("Q") ) {
				courses=courses+"\n"+course;
				feesBalance+=courseFee;
			}
			else
				break;
			}	while(1!=0);
			
		
		//System.out.println("Courses enrolled : "+courses);
		//System.out.println("Balance Fees : "+feesBalance);
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Balance Fees : Rs"+feesBalance);
	}
	
	//pay tution fee
	public void payTutionFees() {
		viewBalance();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your payment amout : Rs");
		int payment=sc.nextInt();
		feesBalance-=payment;
		viewBalance();
	}
	
	//view  status
	
	public String showInfo() {
		
		return "Name: "+firstName+lastName+"\nGrade Year : "+gradeYear+"\nStudent ID : "+studentID+
				"\nCourses Enrolled: "+courses+"\nBalance : "+feesBalance;
	}
	
}
