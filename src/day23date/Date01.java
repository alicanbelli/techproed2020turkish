package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// bug�n�n tarihi
	System.out.println(LocalDate.now());
		// bug�n�n zaman�n� saat
	System.out.println(LocalTime.now());
		// bug�n�n tarih ve saati
	System.out.println(LocalDateTime.now());
	}

}
