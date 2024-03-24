package logicalprogramms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
	
		//int number=81;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter number");
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println("given Number is Even");
		}
		else 
		{
			System.out.println("given Number is odd");
		}
		
		

	}

}
