package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
//Kullanýcýnýn girdiði 4 basamaklý rakamýn 
//ilk ve son rakamýnýn toplamýný veren
//program yapýnýz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamaklý bir tamsayý giriniz.");
		
		int s= scan.nextInt();
		int sBirler=s%10;   
		//-------------->son basamak için 10 a modulus yaparsýn...
		int sBin=s/1000;
		int toplam=sBirler+sBin;
		System.out.println(toplam);
				
		
scan.close();
	}

}
