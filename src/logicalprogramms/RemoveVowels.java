package logicalprogramms;

public class RemoveVowels {

	public static void main(String[] args)
	{
	
		String s="mumbai";//mmb
		String t ="";
		
		for(int i=0; i<=s.length()-1; i++) 
		{
			char character = s.charAt(i);
			
			
			
			if(character=='a'|| character=='e'||character=='i'||character=='o'||character=='u')
			{
				continue;
			}
			t=t+character;
		}
		System.out.println(s);
		System.out.println(t);

	}

}
