package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate convertTexto = LocalDate.parse("2023-12-23");
		LocalDateTime convertTexto1 = LocalDateTime.parse("2023-12-13T01:30:23");
		Instant convertTexto2 = Instant.parse("2023-12-13T01:30:23Z");
		
		LocalDate r1 = LocalDate.ofInstant(convertTexto2, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(convertTexto2, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(convertTexto2, ZoneId.of("Portugal"));
		LocalDateTime r4 = LocalDateTime.ofInstant(convertTexto2, ZoneId.systemDefault());
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 , r4 = " + r3 + " , " + r4);
		
		System.out.println("DIA = " + convertTexto.getDayOfMonth());
		System.out.println("Mes = " + convertTexto.getMonthValue());
		System.out.println("Ano = " + convertTexto.getYear());
		
		System.out.println("Converte texto1 = " + convertTexto1.getHour());
		System.out.println("Converte texto1 = " + convertTexto1.getMinute());
		System.out.println("Converte texto1 = " + convertTexto1.getSecond());
		

	}

}
