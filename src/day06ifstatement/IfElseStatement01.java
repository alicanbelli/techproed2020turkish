package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// kullanýcýdan password girmesini isteyin
		//password dogru ise ekrana password dogru yazdýrýn
		//password yanlýþ ise ekrana passwod yanlýþ tekrar deneyin yazdýrýn
		//dogru password=Java2020

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen Password giriniz");
		String password=scan.next();
		if(password.equals("java2020")) {
			System.out.println("Password doðru");
		}else {
			System.out.println("Password yanlýþ tekrar deneyin");
		}
	scan.close();
	}

}
