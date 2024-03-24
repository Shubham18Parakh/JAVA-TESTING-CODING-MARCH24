package logicalprogramms;

public class PallindromString {

	public static void main(String[] args)
	{

		String s="LEVEL";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) 
		{
			rev=rev+ s.charAt(i);
		}
		System.out.println("Original String is  " + s);
		System.out.println("Reverse String Is " + rev);
		
		if(s.equals(rev)) 
		{
			System.out.println("Given String is Pallindrom");
		}
		else
		{
			System.out.println("Given String is not Pallindrom");
		}

	}

}
