package org.array;

public class Details {
	public void greensomr(int odd) {
		System.out.println(odd);
		
		

	}
	public void greensomr(int add,String name) {
		System.out.println(add+"/n"+name);
		
	

	}
	public void greensomr(String name,int sub) {
		System.out.println("/n+"+sub);
		

	}
	public void greensomr(char str,double ph) {
		System.out.println(str+"/n"+ph);
	

	}
	public static void main(String[] args) {
		Details gt=new Details();
		gt.greensomr(7447);
		gt.greensomr('&', 9865.04);
		gt.greensomr(8557, "srini");
		gt.greensomr("gana", 9669);
		
		
	}

}
