package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		//kullanıcıdan ad ve soyadını alıp ekrana yazdıralım
		//kullanıcıdan adresini alıp ekrana yazdıralım
		//kullanıcıdan yaşını alıp ekrana yazdıralım
		//kullanıcıya "Türkiyede yaşıyorum, Doğru / yanlış " diye soralım, ekrana cevabını 
		//true /false olarak yazdıralım
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Adınızı soyadınızı söyler misiniz?");
		String adıSoyadı=scan.nextLine();
		System.out.println(adıSoyadı);

		System.out.println("adresinizi söyler misiniz?");
		String adres=scan.nextLine();
		System.out.println(adres);
		
		System.out.println("yaşınızı söyler misiniz?");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Türkiyede yaşıyorum, true / false ");
		boolean türkiyedeYaşıyorumDoğruYanlıs  = scan.nextBoolean();
		System.out.println(türkiyedeYaşıyorumDoğruYanlıs);
		
		scan.close();
	}

}
