package patterns;

public class Equilateral_Down {

	public static void main(String[] args) 
	{
	
//		*******
//		 *****
//		  ***
//		   *
		
		//rows----> 4  ----- column--->7---  1st row how many stars-->7--->1st row space=0
		//row-->>outer for loop
		//columns-->>inner for loop-->print inner for loop
		
		 int star=7;
		int  space =0;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space; j++) //for space
			{
				System.out.print(" ");
				
			}
			for(int k=1; k<=star; k++) //for star
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println();
		}

	}

}
