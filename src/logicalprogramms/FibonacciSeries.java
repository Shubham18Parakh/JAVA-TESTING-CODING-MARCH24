package logicalprogramms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=10;
		//0,1-->1---2--->3--5----8----13 

		
		int num1=0;
		int num2=1;
		for(int i=1; i<=num; i++)
		{
			System.out.println(num1 + " ");
			int sum = num1+num2;
			num1=num2;
			num2=sum;
			
		}
		
	}

}
