package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		// kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra dikdörtgenin 
		//alan ve çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		
		Scanner scan= new Scanner(System.in);	
		
		System.out.println("lütfen dikdörgenin kýsa ve uzun kenarlarýný giriniz.");
		int kisa = scan.nextInt();
		System.out.println("lütfen dikdörgenin kýsa ve uzun kenarlarýný giriniz.");
		int uzun = scan.nextInt();
		
		System.out.println(kisa*uzun);
		System.out.println(2*(kisa+uzun));
		
		scan.close();
		
	}

}
