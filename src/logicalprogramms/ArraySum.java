package logicalprogramms;

public class ArraySum {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,8,9,}; //23 total 

		int sum=0;
		
		for(int i=0; i<=ar.length-1; i++) 
		{
			sum=sum+ar[i];
			//1`=0+1
			//3=1+2
			//6=3+3
			//14=8+6
			//23=14+9
		}
		System.out.println("Sum Of All Elements " +sum);
	}

}
