package org.array;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Value1{

	public static void main(String[] args) {
		Map<Integer, String>l=new HashMap<Integer, String>();
		l.put(10, "java");
		l.put(20, "sql");
		l.put(30, "oops");
		l.put(40, "sql");
		l.put(50, "oracle");
		l.put(60, "DB");
		l.put(10, "selenium");
		l.put(50, "psql");
		l.put(40, "Hadoop");
		System.out.println(l);
		//to print keys
		  Set<Integer>j      =l.keySet();
		  System.out.println("keys present in map"+j);
		  for (Integer r : j) {
			  System.out.println(r);
		}
		  //to print value
		    Collection<String>  k  = l.values();
		    System.out.println("values present in map"+k);
		    for (String y : k) {
		    	System.out.println(y);
		     }
		    //to iterate using for enhance loop
		    Set<java.util.Map.Entry<Integer,String>>m    = l.entrySet();
		    System.out.println(m);
		    for (java.util.Map.Entry<Integer, String> n : m) {
		    	System.out.println("key is"+n.getKey());
		    	System.out.println("value is"+n.getValue());
		    	
		    }
		
	
		
	}

}