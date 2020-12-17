package org.array;

public class Account extends BankDetails {
@Override
public void savings() {
	System.out.println("savings is changed to 6%");
	
	
}
@Override
	public void deposit() {
	System.out.println("deposit is minium of rbi is 6%");
	
	}
public static void main(String[] args) {
	Account bs=new Account();
	bs.deposit();
	bs.savings();
	
}

}
