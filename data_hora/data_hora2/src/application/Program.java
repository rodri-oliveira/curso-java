package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate convertTexto = LocalDate.parse("2023-12-23");
		LocalDateTime convertTexto1 = LocalDateTime.parse("2023-12-13T01:30:23");
		Instant convertTexto2 = Instant.parse("2023-12-13T01:30:23Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
 		
		System.out.println("Converte texto = " + convertTexto.format(fmt1));
		System.out.println("Converte texto = " + fmt1.format(convertTexto));
		
		System.out.println("Converte texto = " + fmt2.format(convertTexto1));
		
		System.out.println("Converte texto = " + fmt3.format(convertTexto2));
		
		System.out.println("Converte texto = " + convertTexto1.format(fmt4)) ;

	}

}
