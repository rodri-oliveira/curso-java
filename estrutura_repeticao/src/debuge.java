import java.util.Locale;
import java.util.Scanner;

public class debuge {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A , B, C, areaTR, areaC, areaT, areaQ, areaR;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTR = 0.5 * A * C;
		areaC = 3.14159 * C * C;
		areaT = 0.5 * (A + B) * C;
		areaQ = B * B;
		areaR = B * A;
		
		System.out.printf("Tringulo retangulo : %.3f ", areaTR);
		System.out.printf("Circulo : %.3f ", areaC);
		System.out.printf("Area trpezio : %.3f ", areaT);
		System.out.printf("Quadrado : %.3f ", areaQ);
		System.out.printf("Retangulo : %.3f ", areaR);
		
		sc.close();

	}

}
