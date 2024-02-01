package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavinsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1001, "Alex", 1000.0);
		Account y = new SavinsAccount(1002, "Maria", 1000.0, 0.01);
		
		x.withDraw(500.0);
		y.withDraw(500.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
