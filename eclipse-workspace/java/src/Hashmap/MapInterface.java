package Hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class MapInterface {

	public static void main(String[] args) {
		HashMap<String ,Integer> map= new HashMap<String ,Integer>();
		map.put("Anand", 1234);
		map.put("Anand", 1234);
		map.put("Anand", 1234);
		map.put(null, 1234);
		Set<String> set = map.keySet();
	  for(String Key:set) {
		  System.out.println(map.get(Key));
	  }
		
	
		System.out.println(map.get("Anand"));
		
		Hashtable<String, String> map2= new Hashtable <String ,String>();
		map2.put("password", "1234");
		map2.put(null, "ghgh1234");
		System.out.println(map2.get("username"));
		System.out.println(map2.get(null));
		
		
	}

}
