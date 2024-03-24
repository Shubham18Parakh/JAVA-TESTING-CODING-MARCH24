package patterns;

public class Example15 {

	public static void main(String[] args) 
	{
	
     
		
		        // *         *
				// **       **
				// ***     ***
				// ****   ****
				// ***** *****
				// ****   ****
				// ***     *** 
				// **       **   
				// *         *   
				
		//rows= 9;  coulmn=11  1st row star=
		int star1=1;
		int space1=5;
		int star2=1; 
		int space2=4;
		
		for(int i=1; i<=9; i++) 
		{
			for(int j=1; j<=star1;j++) //for left stars
			{
				System.out.print("*");
			}
			for(int k=1; k<=space1; k++) //for left side space
			{
				System.out.print(" ");
			}
			for(int l=1; l<=space2; l++) //for right side space
			{
				System.out.print(" ");
			}
			for(int m=1; m<=star2; m++) //for right stars
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5) 
			{
				star1++;
				star2++;
				space1--;
				space2--;
				
			}
			else 
			{
				star1--;
				star2--;
				space1++;
				space2++;
			}
		}
	}

}
