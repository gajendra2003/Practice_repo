package Hashmap;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface2 {

	public static void main(String[] args) {
		Set<String>  set= new LinkedHashSet<>();
		set.add("Anand");
		set.add("Bhayre");
		set.add("Techbodhi");
		set.add("Anand");
		set.add("anand");
		for(String s:set) {
			System.out.println(s);
		}

	}

}
