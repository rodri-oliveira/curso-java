package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println("Menos 7 dias: " + pastWeekLocalDate);
		
		LocalDate pastMonthLocalDate = d04.minusMonths(4);
		System.out.println("Menos 4 meses: " + pastMonthLocalDate);
		
		LocalDate nextWeekLocalDate = d04.plusMonths(1);
		System.out.println("Proximo mes: " + nextWeekLocalDate);
		
		System.out.println("--------------------------------------------------");
		
		LocalDateTime pastWeekLocalDateTime1 = d05.minusDays(7);
		System.out.println("Menos 7 dias: " + pastWeekLocalDateTime1);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusHours(7);
		System.out.println("Menos 7 horas: " + pastWeekLocalDateTime);
		
		LocalDateTime pastMonthLocalDateTime = d05.minusMinutes(15);
		System.out.println("Menos 15 minutos: " + pastMonthLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = d05.plusHours(4);
		System.out.println("Mais 4 horas: " + nextWeekLocalDateTime);
		
		System.out.println("-------------------------------------------------------");
		
		Instant nextWeekInstant = d06.plus(4, ChronoUnit.HOURS);
		System.out.println("Mais 4 horas: " + nextWeekInstant);
		
		Instant pastDaysInstant = d06.minus(5, ChronoUnit.DAYS);
		System.out.println("Menos 5 dias: " + pastDaysInstant);
		
		System.out.println("------------------------------------------------------");
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("Intervalo entre os valores: " + t1.toHours());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime1, d05);
		System.out.println("intervalo de dias: " + t2.toDays());
		
		long intervaloDias = ChronoUnit.DAYS.between(pastWeekLocalDate, d04);
		System.out.println("Intervalo de dias:" + intervaloDias);
		
		Duration t4 = Duration.between(pastDaysInstant, d06);
		System.out.println("Intervalo de dias:" + t4.toDaysPart());
		
		Duration t5 = Duration.between(d06, nextWeekInstant);
		System.out.println("Intervalo de horas:" + t5.toHours());

	}

}
