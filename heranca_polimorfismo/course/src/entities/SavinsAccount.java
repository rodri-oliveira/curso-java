package entities;

public class SavinsAccount extends Account{
	private double interestRate;
	
	public SavinsAccount() {
		super();
	}

	public SavinsAccount(Integer number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate; 
	}
	
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}
}
