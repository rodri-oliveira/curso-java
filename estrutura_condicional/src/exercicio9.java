import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		double total = 50.0;
		
		if(min > 100) {
			total += (min - 100) * 2;
		}
		
		System.out.printf("Valor conta : %.2f", total);
		
		sc.close();

	}

}
