package entities;

public class GrupoPessoas {
	
	private Pessoa[] pessoas;
	
	public GrupoPessoas(int tamanho) {
		pessoas = new Pessoa[tamanho];
	}
	
	public void adicionarPessoa(int indice, double altura, char genero) {
		pessoas[indice] = new Pessoa(altura, genero);
	}
	
	public double calcularMaiorAltura() {
		double maiorAltura = pessoas[0].getHeight();
		for(int i = 1; i < pessoas.length; i++) {
			if(pessoas[i].getHeight() > maiorAltura) {
				maiorAltura = pessoas[i].getHeight();
			}
		}
		return maiorAltura;
	}
	
	public double menorAltura() {
		double menorAltura = pessoas[0].getHeight();
		for(int i = 1; i < pessoas.length; i++) {
			if(pessoas[i].getHeight() < menorAltura) {
				menorAltura = pessoas[i].getHeight();
			}
		}
		return menorAltura;
	}
	
	public double calcularMediaAlturaMulheres() {
		int contMulheres = 0;
		double somaAlturaMulheres = 0.0;
		
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getGender() == 'F') {
				contMulheres++;
				somaAlturaMulheres += pessoa.getHeight();
			}
		}
		if(contMulheres > 0) {
			return somaAlturaMulheres / contMulheres;
		}else {
			return 0;
		}
	}
	
	public int contarHomens() {
		int contHomens = 0;
		for(Pessoa pessoa: pessoas) {
			if(pessoa.getGender() == 'M') {
				contHomens++;
			}
		}
		return contHomens;
	}
}
