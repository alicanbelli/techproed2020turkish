package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		//saati saniyeye
		//mili km ye
		// kg. ý grama çeviren program yapýnýz
		
		//bu methodu main methodun dýþýnda yapýp 
		//main methodun içinden çaðýrýnýz
		Scanner scan=new Scanner(System.in);
		
		System.out.println("birimi giriniz");
		String birim = scan.nextLine().toLowerCase();
	
		System.out.println("miktarý giriniz");
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
			System.out.println("saat mil veya kg dýþýnda bir birim girmeyiniz");
		}
	}
	
	
	
}
