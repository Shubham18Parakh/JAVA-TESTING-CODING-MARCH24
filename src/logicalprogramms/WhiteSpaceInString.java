package logicalprogramms;

public class WhiteSpaceInString {

	public static void main(String[] args)
	{
		String s="Pune  ";
		
		int counter =0;
		
		for(int i=0; i<=s.length()-1; i++) 
		{
			char ch = s.charAt(i);//0..,1..,2...,3...,4...,
			if(ch==' ')
			{
				counter++;//0..1..2..
			}
		}
		System.out.println("Number Of White Spaces Are " + counter);
		
		//System.out.println(s.charAt(4));

	}

}
