package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionsDemo {
	
	public void setExample() {
		//SLL
//		HashSet<String> names = new HashSet<String>();
//		names.add("ramesh");
//		names.add("suresh");
//		names.add("dan");
//		names.add("ealine");
//		
//		System.out.println(names);
//		
//		Iterator<String> itr = names.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		//DLL
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("ramesh");
		names.add("suresh");
		names.add("dan");
		names.add("ealine");
		
		System.out.println(names);
		System.out.println(names.reversed());
		System.out.println(names);
		
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
	public void listExample() {
		//SLL
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("ramesh");
//		names.add("suresh");
//		names.add("dan");
//		names.add("ealine");
//		
//		System.out.println(names);
//		System.out.println(names.get(2));
//		
//		
//		names.add(1, "obama");
//		
//		System.out.println(names);
//		
//		names.set(3, "michelle;");
//		System.out.println(names);
//		
////		for(int i=0; i<names.size(); i++) {
////			System.out.println(names.get(i));
////		}
//		
//		for (String str : names) {
//			System.out.println(str);
//		}
		
		//DLL
		LinkedList<String> names = new LinkedList<String>();
		names.add("ramesh");
		names.add("suresh");
		names.add("dan");
		names.add("ealine");
		
		System.out.println(names);
		System.out.println(names.get(2));
		
		
		names.add(1, "obama");
		
//		names.
		
		System.out.println(names);
		
		names.set(3, "michelle");
		System.out.println(names);
		
//		for(int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		
		for (String str : names) {
			System.out.println(str);
		}
		
	}
	
	
	public void mapsExample() {
		//SLL
//		HashMap<String, String> user1 = new HashMap<String, String>();
//		user1.put("firstName", "John");
//		user1.put("lastName", "Rambo");
//		user1.put("email", "johnrambo@gmail.com");
//		user1.put("phoneNumber", "12356");
//		
//		System.out.println(user1);
//		
//		System.out.println(user1.get("email"));
//		
//		System.out.println(user1.keySet());
//		
//		user1.replace("phoneNumber", "9999999");
//		System.out.println(user1);
		
		//DLL
		LinkedHashMap<String, String> user1 = new LinkedHashMap<String, String>();
		user1.put("firstName", "John");
		user1.put("lastName", "Rambo");
		user1.put("email", "johnrambo@gmail.com");
		user1.put("phoneNumber", "12356");
		
//		System.out.println(user1);
//		
//		System.out.println(user1.get("email"));
//		
//		System.out.println(user1.keySet());
//		
//		user1.replace("phoneNumber", "9999999");
//		System.out.println(user1);
//		
		System.out.println(user1.firstEntry());
		System.out.println(user1.sequencedValues());
		
				
		
	}
	

	public static void main(String[] args) {
		CollectionsDemo obj = new CollectionsDemo();
//		obj.setExample();
//		obj.listExample();
		obj.mapsExample();

	}

}
