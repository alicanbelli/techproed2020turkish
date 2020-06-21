package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan bir sayýnýn küpünü hesaplayýnýz
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen küpünü almam için bir sayý giriniz.");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(Math.pow(sayi1, 3));
		
		scan.close();
		}

}
