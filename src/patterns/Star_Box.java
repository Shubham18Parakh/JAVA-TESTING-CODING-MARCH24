package patterns;

public class Star_Box {

	public static void main(String[] args) 
	{
		//* * * * *
		//* * * * *
		//* * * * *
		
		//rows----> 5  ----- column--->3---  1st row how many stars-->5
		//row-->>outer for loop
		//columns-->>inner for loop-->print inner for loop
		
		for(int i=1; i<=3;i++) //outer
		{
			for(int j=1; j<=5; j++) //inner
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
