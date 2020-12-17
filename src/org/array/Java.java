package org.array;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Java {
	public static void main(String[] args) {
		Map<Integer, String>l=new HashMap<Integer,String>();
		l.put(10, "idno");
		l.put(2050, null);
		l.put(300, "register no");
		l.put(null,"java" );
		l.put(null, null);
		l.put(600, "automation");
		System.out.println(l);
		//check particular key is present or not
		boolean b  = l.containsKey(350);
		System.out.println(b);
		//check particular value is present or not
		  boolean c     =l.containsValue("idno");
		  System.out.println(c);
		  //pick up particular key
		  String d    = l.get(300);
		  System.out.println(d);
		  //to fetch only keys
		Set<Integer>e  =l.keySet();
		System.out.println(e);
		for (Integer x: e) {
			System.out.println(x);
			//iterate map
			 Set<java.util.Map.Entry<Integer,String>>f  =l.entrySet();
			 System.out.println(f);
			 for (java.util.Map.Entry<Integer, String> g : f) {
				 System.out.println("key is "+g.getKey());
				 System.out.println("value is "+g.getValue());
					
			 }
			 
			
		}
		
		
		
		
	}

}
