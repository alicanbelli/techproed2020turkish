package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// date formatýný deðiþtirmek
		
		LocalDate date= LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-M-yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println(dtf2.format(date.plusDays(2)));
		
		// time formatýný deðiþtirmek

		LocalTime time= LocalTime.now();
		DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("HH_mm_ss");
		// burda h ha	rfini büyük yaparsan 24 saatlik fprmatý kulanýr
		
		System.out.println(dtf3.format(time));
		System.out.println(dtf3.format(time.plusHours(17)));

	// baþka bir ülkenin zamanýný almak
		
//		System.out.println(LocalTime.now(ZoneId.of("America/Sao_paulo")));
		
		
	}

}
