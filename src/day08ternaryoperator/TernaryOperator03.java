package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullan�c�dan iki say� al�n�z
		// k���k say�y� ekrana yazd�r�n�z
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen ilk say�y� giriniz.");
		int sayi1=scan.nextInt();
		
		System.out.println("L�tfen ikinci say�y� giriniz");
		int sayi2=scan.nextInt();
		
		int sonuc= sayi1<=sayi2 ? sayi1 : sayi2;
		System.out.println(sonuc);
			
		scan.close();
	}

}
