package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

// kullan�c� iki tam say� versin.
		//program bu say�lar�n toplam�n� ve �arp�m�n� ekrana yazd�rs�n.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki tam say� giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);		

		
		scan.close();
	}

}
