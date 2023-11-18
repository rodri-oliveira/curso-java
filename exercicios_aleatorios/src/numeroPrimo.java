import java.util.ArrayList;
import java.util.Scanner;

public class numeroPrimo {

	public static void main(String[] args) {

		ArrayList<Integer> listaPrimo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			
			boolean ehPrimo = true;
			
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			if(ehPrimo == true) {
				listaPrimo.add(i);
			}
		}
		
		System.out.println("Lista de numeros primos: " + listaPrimo);
		
		sc.close();

	}

}
