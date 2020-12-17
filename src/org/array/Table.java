package org.array;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Table {
	public static void main(String[] args) {
		Map<String, String>a=new Hashtable<String,String>();
		        a.put("vel", "Selenium");
		        a.put("ganesh", "framework");
		        a.put("dinesh", "oracle");
		        a.put("vengat", "corejava");
		        a.put("subash", "jira");
		        System.out.println(a);
		        //to print key
		          Set<String> b      = a.keySet();
		          System.out.println("keys present in the map"+b);
		          //to print value in the map
		          Collection<String>  c      =a.values();
		          System.out.println("values present in map"+c);
		          //to iterate using enhanced loop
		        Set<Entry<String,String>>d        =a.entrySet();
		          System.out.println(d);
		          for (Entry<String, String> e : d) {
		        	  System.out.println("keys in the map"+e.getKey());
		        	  System.out.println("values in the map"+e.getValue());
		        		
		          }
		        
		
	}

}
