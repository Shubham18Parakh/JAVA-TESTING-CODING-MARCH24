package logicalprogramms;

public class FindDuplicateElementInArray {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,5,2,4,7,3,7,8,9,5};
		System.out.println("DUPLICATE ELEMENTS ARE");
		for(int i=0; i<ar.length; i++) 
		{
			for(int j=i+1; j<ar.length; j++) 
			{
				if(ar[i]==ar[j]) 
				{
					System.out.print(ar[j] + " ");
					
				}
			}
		}


	}

}
