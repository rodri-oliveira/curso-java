package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Windows\\System32\\drivers\\etc\\hosts\\");
		Scanner sc = null;
		try {
			if(file.exists() && file.canRead()) {
				sc = new Scanner(file);
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}else {
				System.out.println("Não é possível ler o arquivo. Permissão negada.");
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
