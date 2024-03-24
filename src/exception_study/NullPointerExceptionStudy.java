package exception_study;

public class NullPointerExceptionStudy {

	public static void main(String[] args) 
	{
		
		String a ="Hi how are you";
		String b="";
		String c=null;
		
	//System.out.println(c.length());
		
		
		
		try 
		{
			System.out.println(c.charAt(14));
		} 
		catch (Exception e) 
		{
		System.out.println("please try index within length -1");
		}

	}

}
