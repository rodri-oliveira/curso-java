import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int total;
		
		
		if(horaInicial < horaFinal) {
			total = horaFinal - horaInicial;
		}
		else {
				total = 24 - horaInicial + horaFinal;
		}
		
	 
		System.out.printf("A duração do jogo foi %d hora(s)", total);
		sc.close();
		
	}

}
