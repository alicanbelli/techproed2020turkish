package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		//kullan�c�dan isim ve soy ismini al�n
		//kullan�c�n�n isim ve soy isimlerinin ilk harflerinin b�y�k;
		//di�er harflerini b�y�k olarak ekrana yazd�ran program
		
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
