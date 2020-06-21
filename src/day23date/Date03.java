package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time manipulation
		
		LocalTime time= LocalTime.now();
		
		System.out.println(time.plusHours(1));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(1));


		System.out.println(time.minusHours(14));
		System.out.println(time.minusMinutes(5));
		System.out.println(time.minusSeconds(19));

	}

}
