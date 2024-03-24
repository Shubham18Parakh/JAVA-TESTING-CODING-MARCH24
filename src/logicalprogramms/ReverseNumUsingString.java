package logicalprogramms;

public class ReverseNumUsingString {

	public static void main(String[] args)
	{
	
    int orgNum=1234;
    int revNum;
    
  String orgNumString = Integer.toString(orgNum);
  
  String revNumString="";
  
  for(int i =orgNumString.length()-1; i>=0; i--) 
  {
	  revNumString=revNumString + orgNumString.charAt(i);
  }
 // System.out.println(orgNumString);
 // System.out.println(revNumString);//this is reverse number but in string format but we need reverse num in integer 
  
		revNum=Integer.parseInt(revNumString);
		System.out.println(orgNumString);
		System.out.println(revNum);
		
		
	}

}
