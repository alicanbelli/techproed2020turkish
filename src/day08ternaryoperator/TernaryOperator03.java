package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý alýnýz
		// küçük sayýyý ekrana yazdýrýnýz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen ilk sayýyý giriniz.");
		int sayi1=scan.nextInt();
		
		System.out.println("Lütfen ikinci sayýyý giriniz");
		int sayi2=scan.nextInt();
		
		int sonuc= sayi1<=sayi2 ? sayi1 : sayi2;
		System.out.println(sonuc);
			
		scan.close();
	}

}
