import java.util.Scanner;

public class sequenciaFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = 0;
		int B = 1;

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(A);
			B = A + B;
			A = B - A;
		}
		
		sc.close();

	}

}
