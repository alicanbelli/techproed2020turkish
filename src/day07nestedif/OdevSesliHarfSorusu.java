package day07nestedif;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {
		// kullanýcýdan bir harf alýn.
		// eðer harf a e i o u dan biri ise ekrana sesli harf yazdýrýn
		//b c d f  den biri ise ekrana sessiz harf yazdýrýn

		Scanner scan=new Scanner(System.in);
		System.out.println("a, e, i, o, u, b, c, d, f harf giriniz.");
		
		char harf=scan.next().charAt(0);
		
		if (harf=='a' || harf=='e' || harf=='i'||harf=='o' || harf=='u' ) {
			System.out.println(harf + " Sesli harftir");
		}else if (harf=='b' ||harf=='c' ||harf=='d' ||harf=='f') {
			System.out.println(harf + " Sessiz harftir.");
		}else { 
			System.out.println("yanlýþ harf girdiniz");
		}
		scan.close();
   }

}
