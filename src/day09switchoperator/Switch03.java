package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullan�c� ay ismini girsin
		//program ka��nc� ay oldu�unu ekrana yazs�n
		// b�y�k harf k���k harf hepsi i�in �al��s�n
		//yanl�� ay ismin girerse ge�erli ay ismi giriniz desin.

//		Scanner scan=new Scanner(System.in);
//		System.out.println("l�tfen bir ay ismi giriniz");
//		String ay = scan.nextLine();
//		ay=ay.toLowerCase();
		
		Scanner scan=new Scanner(System.in);
		String ay=scan.nextLine();
		switch(ay) {
		case ("ocak"):
			System.out.println("1. ay");
			break;
		case ("subat"):
			System.out.println("2. ay");
			break;
		case ("mart"):
			System.out.println("3.ay");
			break;
		case ("nisan"):
			System.out.println("4. ay");
			break;
		case ("mayis"):
			System.out.println("5. ay");
			break;
		case ("haziran"):
			System.out.println("6. ay");
			break;
		case ("temmuz"):
			System.out.println("7.ay");
			break;
		case ("agustos"):
			System.out.println("8. ay");
			break;
		default:
			System.out.println("ge�erli bir ay giriniz");
			break;
		}
	scan.close();	
	}

}
