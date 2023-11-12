import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2.000) {
			imposto = 0.0;
		}
		else if (salario <= 3.000 ) {
			imposto = (salario - 2.000) * 0.08;
		}
		else if (salario <= 4.500 ) {
			imposto = (salario - 3.000) * 0.18 + 1.000 * 0.08;
		}
		else imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}

	}

}
