package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n�z.
		//say pozitif ise ekrana pozitif yazd�r�n
		// say� negatif ise ekrana negatif yazd�r�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz.");
		
		double sayi=scan.nextDouble();
		
//		if(sayi>=0) {
//			System.out.println("pozitif ya da s�f�r");
//		}else{
//			System.out.println("negatif");
//		}
		
	String sonuc = (sayi>=0) ? "pozitif ya da s�f�r" : "Negatif";
	System.out.println(sonuc);
			
	scan.close();	
	}
}
