package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// bugünün tarihi
	System.out.println(LocalDate.now());
		// bugünün zamanýný saat
	System.out.println(LocalTime.now());
		// bugünün tarih ve saati
	System.out.println(LocalDateTime.now());
	}

}
