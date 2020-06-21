package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// bir kullanýcýdan dikdörtgenin en ve boyunu alýn 
		//eðer en ve boy eþit ise ekrana kare yazdýrýn
		//en ve boy farklý ise ekrana dikdörtgen yazdýrýn
		
		
	Scanner scan= new Scanner(System.in);
	System.out.println("kenar1 deðerini giriniz");
	double kenar1=scan.nextDouble();
	
	System.out.println("kenar2 deðerini giriniz");
	double kenar2=scan.nextDouble();
	
	if(kenar1==kenar2) {
		System.out.println("bu bir karedir");
			}
	if(kenar1!=kenar2) {
		System.out.println("bu bir dikdörtgendir");
	}
	
	if(kenar1==kenar2) {
		System.out.println("karedir");
	}else {
		System.out.println("dikdörtgendir");
	}
	scan.close();
	}

}
