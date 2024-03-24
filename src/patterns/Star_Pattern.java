package patterns;

public class Star_Pattern {

	public static void main(String[] args) 
	{
	
//	   *
//	  ***
//	 *****
//	*******
// *********
//  *******
//   *****
//    ***
//     *
		
		//rows-->>9  column--->>9
		//1st row stars-->>1   space in first row-->>4
		int star=1;
		int space =4;
		for(int i=1; i<=9; i++) 
		{
			for(int j=1; j<=star; j++) 
			{
				System.out.println("*");
				for(int k=1; k<=space; k++) 
				{
					System.out.println(" ");
				}
					star=star+2;
					space--;
					System.out.println();

				
			}
		}

	}

}
