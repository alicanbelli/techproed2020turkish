package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		//  kullan�c� haftan�n g�n numaras�n� girsin
		//program�n�z g�n�n ismini yazs�n
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("g�n numaras� giriniz");
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
			System.out.println("ge�erli gun giriniz");			
		}
		scan.close();
	}
}
