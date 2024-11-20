package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ask for no of student
//		Student st1= new Student();
//		//st1.setStudentID();
//		st1.enroll();
//		// Create n student obj
//		//Student st11= new Student();
//		st1.payTutionFees();
//		System.out.println(st1.showInfo());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of student : ");
		int n= sc.nextInt();
		//Student[] s= new Student[n];
		Student[] arr = new Student[n];;
		
		
		for(int i=0;i<n;i++) {
			//Student[i] st1;
			arr[i] = new Student();
			
			arr[i].setStudentID();
			arr[i].enroll();
			arr[i].payTutionFees();
			System.out.println(arr[i].showInfo());
		}
		
	}
}
