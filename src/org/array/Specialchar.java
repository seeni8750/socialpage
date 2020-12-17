package org.array;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Specialchar {
	public static void main(String[] args) {
		Map<Character, Integer>a=new TreeMap<Character, Integer>();
		a.put('!', 10);
		a.put('@', 20);
		a.put('£', 30);
		a.put('$', 40);
		a.put('%', 50);
		a.put('^', 60);
		a.put('&', 10);
		a.put('*', 20);
		a.put('(', 30);
		System.out.println(a);
		//to print key
		  Set<Character> b  =a.keySet();
		  System.out.println("keys in the map"+b);
		  for (Character c : b) {
			  System.out.println(c);
			  //to print values
			  Collection<Integer>d        =a.values();
			  System.out.println("values in the map"+d);
			  //to iterate using enhanced loop
			  Set<Entry<Character,Integer>>e           = a.entrySet();
			  System.out.println(e);
			  for (Entry<Character, Integer> f : e) {
				  System.out.println("keys in the map"+f.getKey());
				  System.out.println("values present in the map"+f.getValue());
					
			  }
			  
				
		  }
		
	}

}
