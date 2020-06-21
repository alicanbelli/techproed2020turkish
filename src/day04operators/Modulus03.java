package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
// kullanýcýdan 3 basamaklý bir sayý alýn ve 
//bu sayýnýn rakamlarýnýn topamýnýz bulun

		Scanner scan=new Scanner (System.in);
		System.out.println("3 basamaklý bir tam sayý giriniz.");
		int s= scan.nextInt();
		
		int sBir=s/100;
		
		int sAsama=s/10;
		int sOrta=sAsama%10;	
		
		int sUc=s%10;
		
		System.out.println(sBir+sOrta+sUc);
		scan.close();
	}

}
