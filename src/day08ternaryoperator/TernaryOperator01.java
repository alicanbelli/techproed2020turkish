package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýnýz.
		//say pozitif ise ekrana pozitif yazdýrýn
		// sayý negatif ise ekrana negatif yazdýrýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz.");
		
		double sayi=scan.nextDouble();
		
//		if(sayi>=0) {
//			System.out.println("pozitif ya da sýfýr");
//		}else{
//			System.out.println("negatif");
//		}
		
	String sonuc = (sayi>=0) ? "pozitif ya da sýfýr" : "Negatif";
	System.out.println(sonuc);
			
	scan.close();	
	}
}
