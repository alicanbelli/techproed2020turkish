package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// kullanýcýdan password girmesini isteyin
		//password;
	// 4 basamaklý bir sayý ise çift olup olmadýðýný kontrol edin
				// çift ise password tamam yazdýrýn ekrana.
				//tek sayý ise tekrar deneyin yazdýrýn
	// 4 basamaklý deðil ise tekrar deneyin yazdýrýn
		
		//** 4 basamaklý-->999 dan büyük, 10000 den küçük

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz.");
		
		int password = scan.nextInt();
		
		if(password>999 && password<10000) {
			if(password%2==0){
				System.out.println("password tamam");
			}else if(password%2!=0) {
				System.out.println("tekrar deneyin");
			}
		}else {
			System.out.println("tekrar deneyin");
		}
		scan.close();
		
		
		
		 
	}

}
