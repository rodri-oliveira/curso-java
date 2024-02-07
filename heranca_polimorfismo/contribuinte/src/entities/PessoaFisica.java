package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double spendHealth;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double anualIncome, Double spendHealth) {
		super(name, anualIncome);
		this.spendHealth = spendHealth;
	}

	public Double getSpendHealth() {
		return spendHealth;
	}

	public void setSpendHealth(Double spendHealth) {
		this.spendHealth = spendHealth;
	}

	@Override
	public double taxCalculation() {
		double result = 0.0;
		if(getAnualIncome() < 20000.00) {
			result = (getAnualIncome() * 0.15) - (spendHealth * 0.50);
		}
		else if(getAnualIncome() >= 20000.00) {
			result = (getAnualIncome() * 0.25) - (spendHealth * 0.50);
		}
		return result;
	}
	
	
}
