package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// kullan�c�dan password girmesini isteyin
		//password;
	// 4 basamakl� bir say� ise �ift olup olmad���n� kontrol edin
				// �ift ise password tamam yazd�r�n ekrana.
				//tek say� ise tekrar deneyin yazd�r�n
	// 4 basamakl� de�il ise tekrar deneyin yazd�r�n
		
		//** 4 basamakl�-->999 dan b�y�k, 10000 den k���k

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz.");
		
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
