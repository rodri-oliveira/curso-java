import java.util.Scanner;

public class estruturaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int soma = 0;
		while(num != 0) {
			soma += num;
			num = sc.nextInt();
		}
		
		System.out.println("soma: " + soma);
		
		sc.close();

	}

}
