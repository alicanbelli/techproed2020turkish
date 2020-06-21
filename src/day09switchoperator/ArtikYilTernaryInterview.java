package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		// kullanýcýdan bir yýl girmesini isteyin. yýl artýk ise ekrana artuk yýl yazdýrýn,
		//deilse artýk yýl deðil yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yýl giriniz");
		
		int year= scan.nextInt();
		String sonuç = year%100==0 ? (year%400==0 ? "artýk yýl" : "artýk yýl deðil") : ((year%4==0) ? "artýk yýl" : "artýk yýl deðil");
		System.out.println(sonuç);

		scan.close();	
	}

}
