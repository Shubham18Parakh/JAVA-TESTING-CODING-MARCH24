package logicalprogramms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		int num=13;
		int counter=0;
		
		for(int i=2;i<num; i++) //12
		{
			if(num%i==0)
			{
				counter++; //1
				break;
			}
					
		}
		if(counter==1) 
		{
			System.out.println(" Given Num IS not A prime Number");
		}
		else 
		{
			System.out.println(" Given Num Is A prime Number");
		}

	}

}
