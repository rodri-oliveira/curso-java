import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("numero negativo");
		}
		else System.out.println("numero positivo");
		
		sc.close();

	}

}
