package logicalprogramms;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondLargestNumFromArray {

	public static void main(String[] args) 
	{
		int ar[]= {1,3,4,7,8,9,5,6};
		
TreeSet  tr= new TreeSet();
for(int num:ar) //3... 2... 9...
{
	tr.add(num);//
}
System.out.println(tr);

ArrayList al= new ArrayList(tr);
System.out.println("SECOND LOWEST NUMBER =" + al.get(1) );
System.out.println("SECOND Highest NUMBER =" + al.get(al.size()-2) );
		

	}

}
