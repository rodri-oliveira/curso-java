package entities;

public class PessoaJuridica extends Contribuinte{
	
	private int numbersOfEmplyees;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double anualIncome, int numbersOfEmplyees) {
		super(name, anualIncome);
		this.numbersOfEmplyees = numbersOfEmplyees;
	}

	

	public int getNumbersOfEmplyees() {
		return numbersOfEmplyees;
	}

	public void setNumbersOfEmplyees(int numbersOfEmplyees) {
		this.numbersOfEmplyees = numbersOfEmplyees;
	}

	@Override
	public double taxCalculation() {
		double result = 0.0;
		if(numbersOfEmplyees > 10) {
			result = getAnualIncome() * 0.14;
		}else {
			result = getAnualIncome() * 0.16;
		}
		return result;
	}
	
	
}
