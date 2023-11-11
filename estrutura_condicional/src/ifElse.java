import java.util.Locale;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int hora;
		
		System.out.print("Quantas horas : ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.print("Bom dia ");
		}
		else if(hora > 12 && hora < 18) {
			System.out.print("Boa tarde");
		}
		else {
			System.out.print("Boa noite");
		}
		
				
			
		
		
		sc.close();
	}

}
