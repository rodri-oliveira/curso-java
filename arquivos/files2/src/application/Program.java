package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Windows\\System32\\drivers\\etc\\hosts";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			System.out.println("Tentando abrir o arquivo: " + path);

			fr = new FileReader(path);
			br = new BufferedReader(fr);

			System.out.println("Arquivo aberto com sucesso. Iniciando leitura...");

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo. " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
					System.out.println("BufferedReader fechado com sucesso.");
				}
				if (fr != null) {
					fr.close();
					System.out.println("FileReader fechado com sucesso.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
