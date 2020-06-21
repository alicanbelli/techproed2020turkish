package day10stringmethods;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {

	public static void main(String[] args) {
		/*kulan�c�dan ay ismini al�n, e�er ay ismi 31 �eken aylardan birisi ise
		bu ay 31 g�nd�r yazd�r�n.
		e�er ay 30 �eken aylardan biri ise ekrana bu ay 30 g�nd�r yazd�r�n
		e�er ay ismi 28 ya da 29 g�n ise ekrana bu ay subat ay�d�r yazd�r�n
		bu isimlerin d���nda yaz�lan isimler i�in ge�ersiz ay ismi yazd�r�n*/
																			
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ay ismini giriniz.");
		
		String ay = scan.next();
		ay = ay.toLowerCase();
		switch(ay) {
		
		case "ocak":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "subat":
			System.out.println("bu ay 28 veya 29 g�nd�r");
			break;	
		case "mart":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "nisan":
			System.out.println("bu ay 30 g�nd�r");
			break;
		case "may�s":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "haziran":
			System.out.println("bu ay 30 g�nd�r");
			break;
		case "temmuz":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "agustos":
			System.out.println("bu ay 30 g�nd�r");
			break;
		case "eyl�l":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "ekim":
			System.out.println("bu ay 30 g�nd�r");
			break;
		case "kas�m":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "aral�k":
			System.out.println("bu ay 30 g�nd�r");
			break;	
		default:
			System.out.println("ge�erli bir ay ismi giriniz");
			break;	
	
		}
		scan.close();	
	}

}
