package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
// kullan�c�dan ad�n� ve soyad�n� al�p ekrana yazd�ran bir program yaz�n�z
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen ad�n�z� ve soyad�n�z� yaz�n�z");
		
		String isim=scan.nextLine();
		System.out.println(isim);
		scan.close();
	}

}
