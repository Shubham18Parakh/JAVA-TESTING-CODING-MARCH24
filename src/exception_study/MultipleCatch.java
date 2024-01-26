package exception_study;

public class MultipleCatch {

	public static void main(String[] args)
	{
		String a="Velocity";
		String b=null;
		int ar[]= {1,2,3,4};
		
		
		
		try 
		{
			System.out.println(ar[10]);
			//System.out.println(10/0);
			//System.out.println(b.charAt(90));
		} 
		catch (StringIndexOutOfBoundsException e)
		{
		System.out.println("Pass Valid Index");
		}
		catch (NullPointerException e) 
		{
			System.out.println("We can not Work On Null Values");
		}
		catch (ArithmeticException e)
		{
			System.out.println("we cant divide by zero");
		}
		catch (Exception e)
		{
			System.out.println("opps something went wrong");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}

}
