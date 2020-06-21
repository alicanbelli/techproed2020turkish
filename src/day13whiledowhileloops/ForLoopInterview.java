package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// kullanýcýdan bir stiring alýn ve
//		bu stiringi ekrana tersten yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cümle veya kelime giriniz");
		
		String str=scan.nextLine();
		for(int i=str.length()-1 ; i>=0; i--) {
		System.out.print(str.charAt(i));
	}
	
	scan.close();
	
	}
}
