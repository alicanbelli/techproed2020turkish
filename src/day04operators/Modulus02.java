package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
//Kullan�c�n�n girdi�i 4 basamakl� rakam�n 
//ilk ve son rakam�n�n toplam�n� veren
//program yap�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamakl� bir tamsay� giriniz.");
		
		int s= scan.nextInt();
		int sBirler=s%10;   
		//-------------->son basamak i�in 10 a modulus yapars�n...
		int sBin=s/1000;
		int toplam=sBirler+sBin;
		System.out.println(toplam);
				
		
scan.close();
	}

}
