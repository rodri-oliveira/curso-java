import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double num;
		num = sc.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("numero par");
		}
		else System.out.println("numero impar");
		sc.close();
	}

}
