package stringstudy;

public class StringClass {

	public static void main(String[] args)
	{
		//without using new keyword
		String city= "Pune";
		String newcity = city.concat("Maharashtra");
		
		System.out.println(newcity);
		
		StringBuffer name=new StringBuffer("Software");
		name.append( " Testing");
		//name.reverse();

		name.replace(0,8 ,"shubham");
		//name.delete(0, 9);
		System.out.println(name.capacity());
		System.out.println(name);
		
		StringBuilder name1=new StringBuilder("  Selenium");
		name1.append(" TESTNG");
	
		name1.replace(0, 10, " Enginerring");
		System.out.println(name1);
		name1.reverse();
		System.out.println(name1);
		

	}

}
