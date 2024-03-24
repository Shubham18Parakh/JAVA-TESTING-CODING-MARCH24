package stringstudy;

public class StringPracticing {

	public static void main(String[] args) 
	
	{
		String s = "Shubham";
		int slenth = s.length();
		System.out.println("lenth of the string " +slenth );
		String s1="Mandsaur";
		s1.toUpperCase();
		System.out.println(s1.toUpperCase());
		String s2="RATLAM";
		System.out.println(s2.toLowerCase());
	 System.out.println(s2.charAt(3));
	 String a="Mandsaur";
	 System.out.println(s1.equals(a));
	 System.out.println(a==s1);
	 System.out.println(s1.equalsIgnoreCase(s2));
	 String s3= "ratlam";
	 System.out.println(s2.equalsIgnoreCase(s3));
	 System.out.println(s2.endsWith("M"));
	 System.out.println(s1.startsWith("M"));
	 
	 String s5= "";
	 String s6= "                   ";
	 
	 System.out.println(s5.isEmpty());
	 System.out.println(s6.isBlank());
	 
	 String s7= "MY NAME IS SHUBHAM JAIN";
	 System.out.println(s7.substring(11));
	 
	 
	 String s8= "Honesty is the best policy";
	String[] myString = s8.split(" ");
	for(int i =0; i<=myString.length-1; i++) 
	{
		System.out.print(myString[i] + " ");
	}
	 
		String s9= "India lost the world cup";
		System.out.print(s9.replaceAll("India", "Australia"));
	
		
		System.out.println(s2.concat(s3) + " ");
		
		System.out.println(a.lastIndexOf("M"));
		System.out.println(a.indexOf("r"));
		

		

	}

}
