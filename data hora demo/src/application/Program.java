package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-07-25");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-25T12:56:30");
		Instant d06 = Instant.parse("2023-07-25T12:56:30Z");
		Instant d07 = Instant.parse("2023-07-25T12:56:30-03:00");
		LocalDate d08 = LocalDate.parse("26/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("26/07/2023 11:11", fmt2);
		LocalDate d10 = LocalDate.of(2023, 07, 26);
		LocalDateTime d11 = LocalDateTime.of(2023, 07, 26, 11, 33);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		
		System.out.println("---------------------------------------------");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Europe/Moscow"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Asia/Shanghai"));
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("d06 dia = " + r4.getDayOfMonth());
		System.out.println("d06 mes = " + r4.getMonthValue());
		System.out.println("d06 ano = " + r4.getYear());
		
		
		System.out.println("---------------------------------------------");
		
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusWeeks(2);
		LocalDateTime pastHoursLocalDateTime = d05.minusHours(5);
		LocalDateTime nextHoursLocalDateTime = d05.plusHours(10);
		Instant pastWeekInstant = d06.minus(10, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(30, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("pastHoursLocalDateTime = " + pastHoursLocalDateTime);
		System.out.println("nextHoursLocalDateTime = " + nextHoursLocalDateTime);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(nextHoursLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		}
		
		
	}
