package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// kullanýcýdan bir stiring alýn ve bu stiringi ekrana tersten yazdýrýn.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cümle veya kelime giriniz");
		
		String str=scan.nextLine();
		
		int length = str.length()-1;
		while(length >= 0) {
			System.out.print(str.charAt(length));
		length--;
		
		}
				
		scan.close();
		
	}

}
