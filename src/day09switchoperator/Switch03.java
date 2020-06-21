package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullanýcý ay ismini girsin
		//program kaçýncý ay olduðunu ekrana yazsýn
		// büyük harf küçük harf hepsi için çalýþsýn
		//yanlýþ ay ismin girerse geçerli ay ismi giriniz desin.

//		Scanner scan=new Scanner(System.in);
//		System.out.println("lütfen bir ay ismi giriniz");
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
			System.out.println("geçerli bir ay giriniz");
			break;
		}
	scan.close();	
	}

}
