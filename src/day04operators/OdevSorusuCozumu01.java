package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
	//kullan�c�dan integer ald�ktan sonra string alam�yoruz.
		
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Ya��n�z� girer misiniz");
//		String yas=scan.nextLine();
//		int yeniYas=Integer.parseInt(yas);
//		System.out.println(yeniYas);
		
		System.out.println("ya��n�z� girer misiniz");
		String yas=scan.nextLine();
		int yeniYas=Integer.parseInt(yas);
		System.out.println(yas);
		
		
		System.out.println("Ad�n�z� ve soy ad�n�z� girer misiniz");
		String isim=scan.nextLine();
		System.out.println(isim);

scan.close();
	}

}
