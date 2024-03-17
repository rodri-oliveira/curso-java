package entities;

import java.util.Date;

public class LogEntry {

	// Declaração das variáveis de instância para armazenar o nome de usuário e o
	// momento da entrada de log
	private String username; // nome de usuário
	private Date moment; // momento da entrada de log

	// Construtor da classe LogEntry
	public LogEntry(String username, Date moment) {
		this.username = username; // atribui o nome de usuário fornecido ao atributo username
		this.moment = moment; // atribui o momento fornecido ao atributo moment
	}

	// Método getter para obter o nome de usuário
	public String getUsername() {
		return username; // retorna o nome de usuário
	}

	// Método setter para definir o nome de usuário
	public void setUsername(String username) {
		this.username = username; // atribui o nome de usuário fornecido ao atributo username
	}

	// Método getter para obter o momento da entrada de log
	public Date getMoment() {
		return moment; // retorna o momento da entrada de log
	}

	// Método setter para definir o momento da entrada de log
	public void setMoment(Date moment) {
		this.moment = moment; // atribui o momento fornecido ao atributo moment
	}

	// Método hashCode para calcular o código de hash da entrada de log
	@Override
	public int hashCode() {
		final int prime = 31; // número primo para cálculo do código de hash
		int result = 1; // inicializa o resultado com 1
		result = prime * result + ((username == null) ? 0 : username.hashCode()); // cálculo do hash baseado no username
		return result; // retorna o código de hash calculado
	}

	// Método equals para verificar se duas entradas de log são iguais
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // verifica se os objetos são os mesmos na memória
			return true; // se forem os mesmos, são iguais
		if (obj == null) // verifica se o objeto fornecido é nulo
			return false; // se for nulo, não são iguais
		if (getClass() != obj.getClass()) // verifica se os objetos são instâncias da mesma classe
			return false; // se não forem, não são iguais
		LogEntry other = (LogEntry) obj; // faz um cast do objeto fornecido para LogEntry
		if (username == null) { // verifica se o username é nulo
			if (other.username != null) // se for nulo e o username do outro objeto não for, não são iguais
				return false;
		} else if (!username.equals(other.username)) // se o username não for nulo, compara os usernames
			return false; // se forem diferentes, não são iguais
		return true; // se passar por todas as condições acima, os objetos são iguais
	}
}