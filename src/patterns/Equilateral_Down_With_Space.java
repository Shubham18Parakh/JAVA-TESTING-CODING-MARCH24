package patterns;

public class Equilateral_Down_With_Space {

	public static void main(String[] args) 
	{
		
//		* * * *
//		 * * *
//		  * *
//		   *
		
		int star=4;
		int space=0;
		
		//rows----> 4  ----- column--->4---  1st row how many stars-->4--->1st row space=0
		//row-->>outer for loop
		//columns-->>inner for loop-->print inner for loop
		
		
		for(int i =1; i<=4; i++)
		{
			for(int j=1; j<=space; j++) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) 
			{
				System.out.print("* ");
			}
			star--;
			space++;
			System.out.println();
		}

	}

}
