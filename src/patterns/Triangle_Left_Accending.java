package patterns;

public class Triangle_Left_Accending {

	public static void main(String[] args) 
	{
//	  *
//	  **
//	  ***
//	  ****
//	  *****
		
		
		//rows----> 5  ----- column--->5 ---  1st row how many stars-->1
				//row-->>outer for loop
				//columns-->>inner for loop-->print inner for loop
		int star=1;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++) 
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
		
		

	}

}
