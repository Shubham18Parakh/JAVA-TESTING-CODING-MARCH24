package logicalprogramms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
	//String org="Shubham";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter String To Be Reverse");
		String org = sc.next();
	    String rev="";
	
	for(int i=org.length()-1; i>=0; i--) 
	{
		rev=rev +org.charAt(i);
		
	}
	System.out.println("Original String is " + org);
	System.out.println("Reverse String is "+ rev );
	
		
	}

}
