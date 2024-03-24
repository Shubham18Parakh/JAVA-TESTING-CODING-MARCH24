import java.util.Arrays;

public class Practicing
{
	 public static void main(String[] args) {
	        
//	        int[] ar = {1,2,4,8,9,10,23};//24
//	        int sum=0;
//	        
//	        for(int i=0; i<=ar.length-1;i++) 
//	        {
//	        	sum=sum+ar[i];
//	        }
//	        System.out.println("sum of all elements " +  sum);
		 
		 
		 
//	 find duplicate elements in aaray  
		 int ar[]= {2,3,7,4,8,9,2,8,9,1,4,5};
		 
		 for(int i=0; i<ar.length; i++)
		 {
			 for(int j=i+1; j<ar.length;j++)
			 {
				 if(ar[i]==ar[j])
				 {
					 System.out.println(ar[i] + " ");
				 }
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
}
