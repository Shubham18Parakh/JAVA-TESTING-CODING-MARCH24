package logicalprogramms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		
      String s="silent";
      String p="listen";
      
      char[] s1 = s.toCharArray();//['j','a','v','a']
    char[] p1 = p.toCharArray();//['a','v','a','j']
    Arrays.sort(s1);//['a','a','j','v']
    Arrays.sort(p1);//['a','a','j','v']
    
   boolean result = Arrays.equals(s1, p1);
   //System.out.println(result );
    if(result) 
    
    {
    	 	System.out.println("String is Anagram"); 	
    }
    else
    {
    	System.out.println("String is not Anagram");
    }
   
   
	}

}
