package patterns;

public class Triangle_Right_Decending {

	public static void main(String[] args) 
	{
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		
		//rows----> 5  ----- column--->5---  1st row how many stars-->5----->>1st row space=0
		//row-->>outer for loop
		//columns-->>inner for loop-->print inner for loop
		
		int star=5;
		int space=0;
		for(int i=1; i<=5; i++) 
		{
			for(int j=1; j<=space; j++) //for space 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) //for star
			{
				System.out.print("*");
			}
			star--;
			space++;
			System.out.println();
			
			
		}
		
		

	}

}
