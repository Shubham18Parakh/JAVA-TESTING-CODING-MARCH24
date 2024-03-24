package patterns;

public class Triangle_Right_Accending {

	public static void main(String[] args) {
		
//		 *
//	    **
//     ***
//	  ****
 //  *****
		//rows----> 5  ----- column--->5---  1st row how many stars-->1--->1st row space=4
				//row-->>outer for loop
				//columns-->>inner for loop-->print inner for loop
		
		int star=1;
		int space=4;
		for(int i=1;i<=5; i++) 
		{
			for(int j=1; j<=space; j++) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
			
		}
		

	}

}
