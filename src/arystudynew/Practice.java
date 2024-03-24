package arystudynew;

public class Practice {

	public static void main(String[] args) {
		  char[][] albhabet= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		   
		   for(int i=0; i<=albhabet.length-1; i++) 
		   {
			   
			   for(int j=0; j<=albhabet.length-1; j++)
			   {
				   System.out.print( albhabet[i][j] + " ");
			   }
			   }
		   System.out.println();

	}

}
