package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// kullan�c�dan alaca�� �r�n miktar�n� ve fiyat�n� alal�m
		//e�er kullan�c� 1000 den fazla �r�n al�rsa y�zde 20 indirim yapan 
		// ve kullan�c��n�n �deyece�i toplam fiyat� ekrana yazd�r�n
		//e�er kullan�c� 1000 den az ya da 1000 �r�n al�rsa indirim yapmay�n 
		// ve kullan�c��n�n �deyece�i toplam fiyat� ekrana yazd�r�n
		//para konularda double kullanmamak laz�m
		//y�zde indirim yapma= 60 tl.nin inmi� hali 60*80 /100
		
		Scanner scan=new Scanner (System.in);
		System.out.println("alaca��n�z �r�n miktar�n� giriniz.");
		double miktar =scan.nextDouble();
		
		System.out.println("alaca��n�z �r�n fiyat�n� giriniz.");
		double fiyat=scan.nextDouble();
		
		if (miktar>1000) {
			System.out.println(miktar*(fiyat*80)/100);
		}else {
			System.out.println(miktar*fiyat);
		}
	scan.close();	
	}

}
