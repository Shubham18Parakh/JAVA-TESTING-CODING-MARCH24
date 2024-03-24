package patterns;

public class Equilateral_Up_With_Space {

	public static void main(String[] args) 
	{
		//   *
		//  * *
		// * * *
		//* * * *
	
		//rows----> 4  ----- column--->4---  1st row how many stars-->1--->1st row space=3
				//row-->>outer for loop
				//columns-->>inner for loop-->print inner for loop
		
		int star=1;
		int space=3;
				
for(int i=1; i<=4; i++) 
{
	
	for(int j=1; j<=space;j++)
	{
		System.out.print(" ");
	}
	for(int k=1; k<=star; k++)
	{
		System.out.print("* ");
	}
	star++;
	space--;
	System.out.println();
}
	}

}
