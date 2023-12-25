package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//site para formatar data e hora
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
 		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual);
		
		LocalDateTime horaAtual = LocalDateTime.now();
		System.out.println("Hora atual: " + horaAtual);
		
		Instant dataHoraGMT = Instant.now();
		System.out.println("data hora Londres: " + dataHoraGMT);
		
		LocalDate convertTexto = LocalDate.parse("2023-12-23");
		System.out.println("Hora atual: " + convertTexto);
		
		LocalDateTime convertTexto1 = LocalDateTime.parse("2023-12-13T01:30:23");
		System.out.println("Hora atual: " + convertTexto1);
		
		Instant convertTexto2 = Instant.parse("2023-12-13T01:30:23Z");
		System.out.println("Hora atual: " + convertTexto2);
		
		Instant convertTexto3 = Instant.parse("2023-12-13T01:30:23-03:00");
		System.out.println("Hora atual: " + convertTexto3);
		
		LocalDate textoFormatoCustomizado = LocalDate.parse("20/07/2023", format01);
		System.out.println("Texto customizado: " + textoFormatoCustomizado);
		
		LocalDateTime textoFormatoCustomizado1 = LocalDateTime.parse("20/07/2023 01:30", 
							DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("Texto customizado: " + textoFormatoCustomizado1);
		
		LocalDate anoMesDia = LocalDate.of(2023, 12, 30);
		System.out.println("Ano , mes , dia: "+ anoMesDia);
	}

}
