package patterns;

public class Example13 {

	public static void main(String[] args) 
	
	{
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		
		
		
		
		//rows----> 9  ----- column--->5---  1st row how many stars-->1--->1st row space=0
		//row-->>outer for loop
		//columns-->>inner for loop-->print inner for loop
		
		int star=1;
		
		for(int i=1; i<=9; i++) 
		{
			for(int j=1; j<=star; j++) 
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			if(i<5)
			{
				star++;
			}
			else 
			{
				star--;
			}
		}
		
		
		
		

	}

}
