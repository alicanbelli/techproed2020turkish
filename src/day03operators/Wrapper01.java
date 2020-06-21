package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
// kullanýcýdan adýný ve soyadýný alýp ekrana yazdýran bir program yazýnýz
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen adýnýzý ve soyadýnýzý yazýnýz");
		
		String isim=scan.nextLine();
		System.out.println(isim);
		scan.close();
	}

}
