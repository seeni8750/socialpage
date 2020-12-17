package org.array;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Data {
	public static void main(String[] args) {
		Map<Integer, Integer>k=new LinkedHashMap<Integer, Integer>();
		k.put(10, 10);
		k.put(20, 20);
		k.put(30, 30);
		k.put(40, 40);
		k.put(50, 50);
		k.put(60, 60);
		k.put(10, 10);
		k.put(20, 20);
		k.put(30, 30);
		System.out.println(k);
		//to print key
		 Set<Integer> l    = k.keySet();
		 System.out.println("key present in map is "+l);
		 for (Integer m : l) {
			 System.out.println(m);
			 //to print values
			     Collection <Integer>  n      = k.values();
			     System.out.println("values in the map"+n);
			     for (Integer o : n) {
			    	 System.out.println(o);
			    	 //to iterate using enhanced loop
			    Set<java.util.Map.Entry<Integer,Integer>>p	      = k.entrySet();
			         System.out.println(p);
			         for (Entry<Integer, Integer> q : p) {
			        	 System.out.println("key is "+q.getKey());
			        	 System.out.println("value is "+q.getValue());
			        		
			         }
			    	 
			    		
			     }
			
		}
		 
	
		
	}

}
