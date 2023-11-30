package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Digite o nome do aluno: ");
		student.nome = sc.next();
		System.out.println("Digite a nota 1, nota 2, nota 3: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		student.somarNotas();
		student.verificaNota();
		
		System.out.println(student);
		
		
		sc.close();

	}

}
