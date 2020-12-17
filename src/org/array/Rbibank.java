package org.array;

public class Rbibank extends Total  {
	@Override
	public void deposit() {
	System.out.println("deposit is changed to 5%");
		
	}

	@Override
	public void savings() {
         System.out.println("savings is changed to 8%");
		
	}public static void main(String[] args) {
		Rbibank b=new Rbibank();
		b.deposit();
		b.savings();
		b.interest();
	}

}
