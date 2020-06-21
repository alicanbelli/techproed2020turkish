package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanýcýdan ilk ismini alýn ekrana yazdýrýn
		//soyismini alýn ekrana ilk isminin altýna yazrýdýn.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Ýsminizi söyler misiniz");
		String isim=scan.next();
		
		System.out.println("soyisminizisöyler misiniz?");
		String soyisim=scan.next();
		
		System.out.println(isim + soyisim);
		System.out.println(soyisim);
		
		scan.close();
	}

}
