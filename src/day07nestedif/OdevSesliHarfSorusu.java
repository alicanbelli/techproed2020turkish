package day07nestedif;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {
		// kullan�c�dan bir harf al�n.
		// e�er harf a e i o u dan biri ise ekrana sesli harf yazd�r�n
		//b c d f  den biri ise ekrana sessiz harf yazd�r�n

		Scanner scan=new Scanner(System.in);
		System.out.println("a, e, i, o, u, b, c, d, f harf giriniz.");
		
		char harf=scan.next().charAt(0);
		
		if (harf=='a' || harf=='e' || harf=='i'||harf=='o' || harf=='u' ) {
			System.out.println(harf + " Sesli harftir");
		}else if (harf=='b' ||harf=='c' ||harf=='d' ||harf=='f') {
			System.out.println(harf + " Sessiz harftir.");
		}else { 
			System.out.println("yanl�� harf girdiniz");
		}
		scan.close();
   }

}
