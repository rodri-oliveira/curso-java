import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int x, int m, int w) {
		int aux;
		if(x > m && x > w) {
			aux = x;
		}else if(m > x && m > w) {
			aux = m;
		}else {
			aux = w;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {
		System.out.println("higher = " + value);
	}

}
