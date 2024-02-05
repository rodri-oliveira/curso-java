package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavinsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavinsAccount(1001, "Alex", 1000.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 500.0));
		list.add(new SavinsAccount(1003, "João", 1000.0, 0.01));
		list.add(new BusinessAccount(1004, "Claudio", 1000.0, 300.00));
		
		double sum = 0.0;
		for(Account ac : list) {
			sum += ac.getBalance();
		}
		
		System.out.println("Total: " + sum);
		
		for(Account acc : list) {
			acc.deposit(50.0);
		}
		
		for(Account ac : list) {
			System.out.printf("Balance: %.2f\n" , ac.getBalance());
		}
		
	}

}
