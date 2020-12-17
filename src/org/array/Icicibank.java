package org.array;

public class Icicibank implements Mark {

	@Override
	public void saving() {
		System.out.println("savings is minimum of 9%");
		
	}

	@Override
	public void deposit() {
	System.out.println("deposit is minimum of 6%");
		
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		
	}public static void main(String[] args) {
		Icicibank b=new Icicibank();
		b.saving();
		b.fixed();
		
	}
	
}
