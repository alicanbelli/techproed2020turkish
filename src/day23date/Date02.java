package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// date manip�lation date �zerinde de�i�iklik yapma 

		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusDays(3));// 3 g�n ekler
		System.out.println(date.plusWeeks(2));// 2 hafta ekler
		System.out.println(date.plusMonths(2));// 2 ay ekler
		System.out.println(date.plusYears(2));// 2 y�l ekler
		
		
		System.out.println(date.minusDays(2));// 2 g�n geri gider
		System.out.println(date.minusWeeks(2));// 2 hafta geri gider
		System.out.println(date.minusMonths(2));// 2 ay geri gider
		System.out.println(date.minusYears(2));// 2 y�l geri gider

	}

}
