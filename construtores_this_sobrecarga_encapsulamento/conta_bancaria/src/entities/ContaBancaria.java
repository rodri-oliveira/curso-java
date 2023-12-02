package entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeUsuario;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeUsuario, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
		deposito(depositoInicial);
	}
	
	public ContaBancaria(int numeroConta, String nomeUsuario) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.00;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Conta: "
				+ numeroConta
				+ " , "
				+ "Cliente: "
				+ nomeUsuario
				+ " , "
				+ " Saldo: "
				+ " R$ "
				+ String.format("%.2f", saldo);
	}

}
