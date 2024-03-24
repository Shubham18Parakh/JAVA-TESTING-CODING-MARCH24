package logicalprogramms;

public class ArmStrongNum {

	public static void main(String[] args) 
	
	{
		int num=153;
		int sum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			
			//System.out.println(i%10);
			int rem = i%10;
			sum=sum + (rem*rem*rem);
			
		}
	System.out.println(num);	
System.out.println(sum);

if(num==sum)
{
	System.out.println("Given Num Is ArmStrongNum");
}
else {
	System.out.println("Given Num Is not ArmStrongNum");
}

	}

}
