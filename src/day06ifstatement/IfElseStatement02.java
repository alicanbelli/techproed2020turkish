package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// kullanýcýdan bir tamsayý isteyin
		//o tam sayýnýn mutlak deðerini ekrana yazdýrýn.
		//mutlak deðer sayýnýn kendi iþareti ile çarpýlmasýdýr.
		//-3 ün mutlak deðeri -1*-3=3
		// +5 in mutlak deðeri +1*+5=5
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz.");
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num*(+1));
		}else {
			System.out.println(num*(-1));
		}
		scan.close();
	}
}
