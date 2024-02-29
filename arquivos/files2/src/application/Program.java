package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Windows\\System32\\drivers\\etc\\hosts";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			System.out.println("Tentando abrir o arquivo: " + path);

			System.out.println("Arquivo aberto com sucesso. Iniciando leitura...");

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo. " + e.getMessage());
		}
	}
}
