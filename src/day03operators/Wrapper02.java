package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullan�c�dan ilk ismini al�n ekrana yazd�r�n
		//soyismini al�n ekrana ilk isminin alt�na yazr�d�n.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("�sminizi s�yler misiniz");
		String isim=scan.next();
		
		System.out.println("soyisminizis�yler misiniz?");
		String soyisim=scan.next();
		
		System.out.println(isim + soyisim);
		System.out.println(soyisim);
		
		scan.close();
	}

}
