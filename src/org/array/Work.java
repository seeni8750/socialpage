package org.array;

import java.io.File;

public class Work {
	public static void main(String[] args) {
		File f=new File("C:\\selenium");
		 boolean a     =f.mkdir();
		 System.out.println(a);
		 File g=new File("C:\\selenium//tool//day1");
		  boolean b   = f.mkdirs();
		  System.out.println(b);
		
	}

}
