import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("s�o multiplos");
		}
		else System.out.println("n�o s�o multiplos");
		
		sc.close();
	}

}
