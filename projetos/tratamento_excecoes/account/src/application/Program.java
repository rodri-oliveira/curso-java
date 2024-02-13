package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter with account date: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double witdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, witdrawLimit);
			
			System.out.println();
			System.out.print("Enter with amount for withdraw: ");
			double withdraw = sc.nextDouble();
			acc.checkTransactionValidity(withdraw);
			acc.withdraw(withdraw);
			
			System.out.println(acc);
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid format: ");
		}
		catch (DomainException e) {
			System.out.println("With draw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e.getMessage());
			e.printStackTrace();
		}
		
		sc.close();

	}

}
