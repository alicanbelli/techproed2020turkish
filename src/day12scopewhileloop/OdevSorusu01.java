package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		 //kullanýcýdan yaþadýðý ülkenin ismini alýn ve bu ülkenin
		//baþtan ikinci harfi ile sondan ikinci harfini büyük harf 
		//olarak ekrana yazdýrýn.
		
		Scanner scan=new Scanner(System.in);  //--->UY
		
		System.out.println("yaþadýðýnýz ülkenin iþmini giriniz.");
		
		String ulke=scan.nextLine();
		ulke= ulke.toUpperCase();
		System.out.println(ulke.substring(1,2) + 
				ulke.substring(ulke.length()-2, ulke.length()-1));
		
		// öðretmenin yolu
		
		System.out.print(ulke.charAt(1));
		System.out.println(ulke.charAt(ulke.length()-2));
		
	scan.close();	

	}

}
