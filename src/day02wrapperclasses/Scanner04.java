package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		// kullan�c�dan dikd�rtgenin boyutlar�n� alan ve sonra dikd�rtgenin 
		//alan ve �evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
		
		Scanner scan= new Scanner(System.in);	
		
		System.out.println("l�tfen dikd�rgenin k�sa ve uzun kenarlar�n� giriniz.");
		int kisa = scan.nextInt();
		System.out.println("l�tfen dikd�rgenin k�sa ve uzun kenarlar�n� giriniz.");
		int uzun = scan.nextInt();
		
		System.out.println(kisa*uzun);
		System.out.println(2*(kisa+uzun));
		
		scan.close();
		
	}

}
