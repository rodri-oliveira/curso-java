package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Cria um conjunto para armazenar as entradas de log únicas
			Set<LogEntry> set = new HashSet<>();

			// Lê cada linha do arquivo de log
			String line = br.readLine();
			while (line != null) {
				// Divide a linha em campos separados por espaços
				String[] fields = line.split(" ");
				// Extrai o nome de usuário do primeiro campo e o momento da entrada de log do
				// segundo campo
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				// Cria uma nova instância de LogEntry com o nome de usuário e o momento e a
				// adiciona ao conjunto
				set.add(new LogEntry(username, moment));

				// Lê a próxima linha do arquivo
				line = br.readLine();
			}
			// Exibe o total de usuários únicos no arquivo de log
			System.out.println("Total users: " + set.size());

		} catch (IOException e) {
			// Exibe uma mensagem de erro caso ocorra uma exceção de E/S durante a leitura
			// do arquivo
			System.out.println("Error: " + e.getMessage());
		} finally {
			// Fecha o objeto Scanner após a conclusão da leitura do arquivo
			sc.close();
		}
	}
}