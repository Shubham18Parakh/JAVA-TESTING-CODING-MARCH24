package logicalprogramms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	
	{
//		int a=5;
//		int b=10;
//		int sum =a+b;
//		System.out.println("sum is " + sum);
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Please Enter Value Of a");
//          int a=sc.nextInt();
//          System.out.println("Please Enter Value Of b");
//          int b= sc.nextInt();
//          
//          int sum = a+b;
//          System.out.println("Value of sum is ");
		
		//firstname
		//middle name
		//lastname
		//your full name is
		System.out.println("Please Enter firstname");
		String firstname = sc.next();
		System.out.println("Please Enter middle name");
		String middlename = sc.next();
		System.out.println("Please Enter last name");
		String lastname = sc.next();
		
		System.out.println("your full name is " + firstname +" "+ middlename +" "+ lastname);

	}

}
