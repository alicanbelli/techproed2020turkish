package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		 //kullan�c�dan ya�ad��� �lkenin ismini al�n ve bu �lkenin
		//ba�tan ikinci harfi ile sondan ikinci harfini b�y�k harf 
		//olarak ekrana yazd�r�n.
		
		Scanner scan=new Scanner(System.in);  //--->UY
		
		System.out.println("ya�ad���n�z �lkenin i�mini giriniz.");
		
		String ulke=scan.nextLine();
		ulke= ulke.toUpperCase();
		System.out.println(ulke.substring(1,2) + 
				ulke.substring(ulke.length()-2, ulke.length()-1));
		
		// ��retmenin yolu
		
		System.out.print(ulke.charAt(1));
		System.out.println(ulke.charAt(ulke.length()-2));
		
	scan.close();	

	}

}
