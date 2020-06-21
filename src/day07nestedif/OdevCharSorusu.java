package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
// kullanýcýdan bir character alýn 
//alýnan character bir harf ise ekrana harf yazdýrýn
//diðer durumlarda ekrana harf deðil yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir char deðeri giriniz");
		char harf=scan.next().charAt(0);
				
		if ((harf<=90 && harf>=65) || (harf<=122 && harf>=97)) {
			System.out.println("HARF");
		}else
			System.out.println("HARF DEÐÝLDÝR");
scan.close();
	}

}
