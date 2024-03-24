package logicalprogramms;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) 
	{
	
   // int number=3;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("please enter a NUMBER" );
		int number = sc.nextInt();
		
    int fact=1;
    
    for(int i=number; i>=1; i--)
    {
    	System.out.println(i);
    	fact=fact*i;
    }
    
    System.out.println("Factorial of  " + number + " is "+ fact );
    
	}

}
