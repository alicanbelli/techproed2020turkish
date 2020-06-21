package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		//kullanýcýdan ad ve soyadýný alýp ekrana yazdýralým
		//kullanýcýdan adresini alýp ekrana yazdýralým
		//kullanýcýdan yaþýný alýp ekrana yazdýralým
		//kullanýcýya "Türkiyede yaþýyorum, Doðru / yanlýþ " diye soralým, ekrana cevabýný 
		//true /false olarak yazdýralým
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Adýnýzý soyadýnýzý söyler misiniz?");
		String adýSoyadý=scan.nextLine();
		System.out.println(adýSoyadý);

		System.out.println("adresinizi söyler misiniz?");
		String adres=scan.nextLine();
		System.out.println(adres);
		
		System.out.println("yaþýnýzý söyler misiniz?");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Türkiyede yaþýyorum, true / false ");
		boolean türkiyedeYaþýyorumDoðruYanlýs  = scan.nextBoolean();
		System.out.println(türkiyedeYaþýyorumDoðruYanlýs);
		
		scan.close();
	}

}
