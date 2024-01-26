package exception_study;

public class MathsOperation {

	public static void main(String[] args)
	{
	
		int a=10;
		int b = 0;
		try
		{
			System.out.println(a/b); //risky code
		}
		catch (Exception e)
		{
		System.out.println("Sorry We Cant Divide By Zero");
		}
		
System.out.println("hello shubham");
	}

}
