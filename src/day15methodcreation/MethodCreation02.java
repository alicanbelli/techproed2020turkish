package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		//saati saniyeye
		//mili km ye
		// kg. � grama �eviren program yap�n�z
		
		//bu methodu main methodun d���nda yap�p 
		//main methodun i�inden �a��r�n�z
		Scanner scan=new Scanner(System.in);
		
		System.out.println("birimi giriniz");
		String birim = scan.nextLine().toLowerCase();
	
		System.out.println("miktar� giriniz");
		double miktar = scan.nextDouble();
		
		donusturucu (birim,miktar);
		
		scan.close();
		
	}

	public static void donusturucu(String birim, double miktar) {
		switch(birim) {
		case "saat":
			System.out.println(miktar*60*60);
			break;
		case "mil":
			System.out.println(miktar*1.6);
			break;
		case "kilogram":
			System.out.println(miktar*1000);
			break;
		default:
			System.out.println("saat mil veya kg d���nda bir birim girmeyiniz");
		}
	}
	
	
	
}
