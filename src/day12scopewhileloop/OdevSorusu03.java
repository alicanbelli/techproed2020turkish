package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		// kullan�c�dan ba�lang�� ve biti� harflarini al�n 
		//ba�lang�� harfinden ba�lay�p biti� harfinde biten t�m harfleri
		//b�y�k harf olarak ekrana yazd�r�n�z

		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� harfini giriniz");
		char ch1 =scan.next().toUpperCase().charAt(0);
		System.out.println("biti� harfini giriniz");
		char ch2 =scan.next().toUpperCase().charAt(0);

		if(ch1>ch2) {
			System.out.println("alfabtik s�ra ile giriniz");
		}else if((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A')) { 
			for(char i = ch1 ; i<= ch2; i++) {
			System.out.println(i);		
			}
		
	}else {
		System.out.println("ba�lang�� ve biti� harf olmal�d�r");
	}
scan.close();
	}
}