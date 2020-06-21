package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

// kullanýcý iki tam sayý versin.
		//program bu sayýlarýn toplamýný ve çarpýmýný ekrana yazdýrsýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki tam sayý giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);		

		
		scan.close();
	}

}
