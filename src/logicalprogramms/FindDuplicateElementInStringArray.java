package logicalprogramms;

public class FindDuplicateElementInStringArray {

	public static void main(String[] args) 
	{
		
		String ar []= {"testing","testng","java","selenium","java","testng","maven","testing","selenium"};
System.out.println("Duplicate Elements Are");

for(int i=0; i<ar.length; i++) 
{
	
	for(int j=i+1; j<ar.length; j++) 
	{
		if(ar[i].equals(ar[j]))
		{
			System.out.print(ar[j] + " ");
			
		}
	}
}
		
		
		
		
		
	}

}
