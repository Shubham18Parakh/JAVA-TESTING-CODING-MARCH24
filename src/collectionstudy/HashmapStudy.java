package collectionstudy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapStudy {

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> mp=new HashMap<>();
		System.out.println(mp);
		//put -->to add key and its value

//		System.out.println(mp.put(1, "Ram"));
//		System.out.println(mp.put(2, "Rahim"));
//		System.out.println(mp.put(3, "ABC"));
//		System.out.println("==============================");
//		System.out.println(mp.put(1, "Laxman"));
//		System.out.println(mp.put(3, "XYZ"));
//		
//		System.out.println("====================");
//		mp.put(4, "XYZ");
//		System.out.println(mp);
		
		mp.put(1, "Mahesh");
		mp.put(2, "Dipika");
		mp.put(3, "Ranbir");
		mp.put(4, "Mahesh");
		mp.put(1, "Rajni");
		System.out.println(mp);
		System.out.println("===================");
		System.out.println(mp.get(1));
		System.out.println("===================");
		System.out.println(mp.containsValue("Rajni"));
		
		
		Set<Entry<Integer, String>> myset = mp.entrySet();
		for(Entry<Integer, String> ms:myset) 
		{
			System.out.println(ms);
//			System.out.println(ms.getKey());
//			System.out.println(ms.getValue());
			
		}
		
	}

}
