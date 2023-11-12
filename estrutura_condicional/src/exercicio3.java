import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("são multiplos");
		}
		else System.out.println("não são multiplos");
		
		sc.close();
	}

}
