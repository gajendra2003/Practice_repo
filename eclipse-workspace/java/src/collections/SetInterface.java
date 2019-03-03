package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		/*HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		for(int a:set) {
			System.out.println(a);
		}*/

/*
			LinkedHashSet<Integer> set=new LinkedHashSet<>();
			set.add(10);
			set.add(20);
			set.add(10);
			set.add(20);
			for(int a:set) {
				System.out.println(a);
			}

	*/

		TreeSet<Integer> set=new TreeSet<>();
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(20);
		for(int a:set) {
			System.out.println(a);
		}


	

	}

}
