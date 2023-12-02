package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBancaria;
		
		System.out.print("Entre com o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Nome do cliente: : ");
		sc.nextLine();
		String nomeCliente = sc.next();
		
		System.out.print("Deseja fazer deposito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Digite o deposito inicial: ");
			double depositoIncial = sc.nextDouble();
			contaBancaria = new ContaBancaria(numeroConta, nomeCliente, depositoIncial);
		}
		else {
			contaBancaria = new ContaBancaria(numeroConta, nomeCliente);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double deposito = sc.nextDouble();
		contaBancaria.deposito(deposito);
		
		System.out.println();
		System.out.println("Dados atualizado:");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		contaBancaria.saque(valorSaque);
		
		System.out.println();
		System.out.println("Dados atualizado:");
		System.out.println(contaBancaria);
		
		sc.close();

	}

}
