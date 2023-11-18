import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<= num; i++) {
			System.out.println(i + " " + i * i + " " + (int) Math.pow(i, 3));
		}
		
		sc.close();

	}

}
