package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		//kullanýcýdan isim ve soy ismini alýn
		//kullanýcýnýn isim ve soy isimlerinin ilk harflerinin büyük;
		//diðer harflerini büyük olarak ekrana yazdýran program
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("ekrana ilk isminizi giriniz");
		String ilkIsim = scan.nextLine().toLowerCase();
		
		System.out.println("ekrana soy isminizi giriniz");
		String soyIsim = scan.nextLine().toLowerCase();

		isimYazma(ilkIsim,soyIsim);
		scan.close();
	}
public static void isimYazma (String ilkIsim, String soyIsim) {
	ilkIsim=ilkIsim.substring(0,1).toUpperCase() + ilkIsim.substring(1);
	soyIsim=soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1);
		
	System.out.println(ilkIsim + " " + soyIsim);	
	}	
}
