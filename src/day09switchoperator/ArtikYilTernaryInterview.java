package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		// kullan�c�dan bir y�l girmesini isteyin. y�l art�k ise ekrana artuk y�l yazd�r�n,
		//deilse art�k y�l de�il yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("y�l giriniz");
		
		int year= scan.nextInt();
		String sonu� = year%100==0 ? (year%400==0 ? "art�k y�l" : "art�k y�l de�il") : ((year%4==0) ? "art�k y�l" : "art�k y�l de�il");
		System.out.println(sonu�);

		scan.close();	
	}

}
