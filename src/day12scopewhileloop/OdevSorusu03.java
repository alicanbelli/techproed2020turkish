package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		// kullanýcýdan baþlangýç ve bitiþ harflarini alýn 
		//baþlangýç harfinden baþlayýp bitiþ harfinde biten tüm harfleri
		//büyük harf olarak ekrana yazdýrýnýz

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç harfini giriniz");
		char ch1 =scan.next().toUpperCase().charAt(0);
		System.out.println("bitiþ harfini giriniz");
		char ch2 =scan.next().toUpperCase().charAt(0);

		if(ch1>ch2) {
			System.out.println("alfabtik sýra ile giriniz");
		}else if((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A')) { 
			for(char i = ch1 ; i<= ch2; i++) {
			System.out.println(i);		
			}
		
	}else {
		System.out.println("baþlangýç ve bitiþ harf olmalýdýr");
	}
scan.close();
	}
}