package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		//  kullanýcý haftanýn gün numarasýný girsin
		//programýnýz günün ismini yazsýn
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("gün numarasý giriniz");
		int gun=scan.nextInt();
				
		switch (gun) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
		default:
			System.out.println("geçerli gun giriniz");			
		}
		scan.close();
	}
}
