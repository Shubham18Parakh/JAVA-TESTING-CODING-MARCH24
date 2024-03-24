package logicalprogramms;

public class ReverseNumWithioutUsingStringMethod {

	public static void main(String[] args) 
	{
	
int num =1234;
int revNum=0;
//System.out.print(num%10);
//System.out.print(123%10);
//System.out.print(12%10);
//System.out.print(1%10);

for(int i=num; i>0; i=i/10)
{
	int rem = i%10;
	revNum=revNum*10 + rem;
}
System.out.println(revNum);
		
		
	}

}
