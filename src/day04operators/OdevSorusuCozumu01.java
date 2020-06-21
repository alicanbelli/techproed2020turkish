package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
	//kullanýcýdan integer aldýktan sonra string alamýyoruz.
		
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Yaþýnýzý girer misiniz");
//		String yas=scan.nextLine();
//		int yeniYas=Integer.parseInt(yas);
//		System.out.println(yeniYas);
		
		System.out.println("yaþýnýzý girer misiniz");
		String yas=scan.nextLine();
		int yeniYas=Integer.parseInt(yas);
		System.out.println(yas);
		
		
		System.out.println("Adýnýzý ve soy adýnýzý girer misiniz");
		String isim=scan.nextLine();
		System.out.println(isim);

scan.close();
	}

}
