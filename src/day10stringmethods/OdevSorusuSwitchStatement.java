package day10stringmethods;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {

	public static void main(String[] args) {
		/*kulanýcýdan ay ismini alýn, eðer ay ismi 31 çeken aylardan birisi ise
		bu ay 31 gündür yazdýrýn.
		eðer ay 30 çeken aylardan biri ise ekrana bu ay 30 gündür yazdýrýn
		eðer ay ismi 28 ya da 29 gün ise ekrana bu ay subat ayýdýr yazdýrýn
		bu isimlerin dýþýnda yazýlan isimler için geçersiz ay ismi yazdýrýn*/
																			
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen ay ismini giriniz.");
		
		String ay = scan.next();
		ay = ay.toLowerCase();
		switch(ay) {
		
		case "ocak":
			System.out.println("bu ay 31 gündür");
			break;
		case "subat":
			System.out.println("bu ay 28 veya 29 gündür");
			break;	
		case "mart":
			System.out.println("bu ay 31 gündür");
			break;
		case "nisan":
			System.out.println("bu ay 30 gündür");
			break;
		case "mayýs":
			System.out.println("bu ay 31 gündür");
			break;
		case "haziran":
			System.out.println("bu ay 30 gündür");
			break;
		case "temmuz":
			System.out.println("bu ay 31 gündür");
			break;
		case "agustos":
			System.out.println("bu ay 30 gündür");
			break;
		case "eylül":
			System.out.println("bu ay 31 gündür");
			break;
		case "ekim":
			System.out.println("bu ay 30 gündür");
			break;
		case "kasým":
			System.out.println("bu ay 31 gündür");
			break;
		case "aralýk":
			System.out.println("bu ay 30 gündür");
			break;	
		default:
			System.out.println("geçerli bir ay ismi giriniz");
			break;	
	
		}
		scan.close();	
	}

}
