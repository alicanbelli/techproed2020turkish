package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
// kullan�c�dan 3 basamakl� bir say� al�n ve 
//bu say�n�n rakamlar�n�n topam�n�z bulun

		Scanner scan=new Scanner (System.in);
		System.out.println("3 basamakl� bir tam say� giriniz.");
		int s= scan.nextInt();
		
		int sBir=s/100;
		
		int sAsama=s/10;
		int sOrta=sAsama%10;	
		
		int sUc=s%10;
		
		System.out.println(sBir+sOrta+sUc);
		scan.close();
	}

}
