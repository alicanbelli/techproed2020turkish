package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// kullan�c�dan notunu al�n ve a�a��daki kurallara g�re A-B-C-D YAZDIRIN
		// 0(dahil) ile 50 aras� D
		// 50 (DAH�L) ile 60 aras� C
		//60 dahil ile 80 aras� B
		//80 DAH�L ile 100 aras� A
		//Yanl�� not girilirse ekrana yanl�� not girdiniz yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen notunuzu giriniz");
		int not = scan.nextInt();

		if (not>=0 && not<50) {
			not=0;
		}else if (not>=50 && not<60) {
			not=50;
		}else if (not>=60 && not<80) {
			not=60;
		}else if (not>=80 && not<=100) {
			not=80;
		}

		switch(not) {
		
		case 0:
		System.out.println('D');
		break;
		
		case 50:
			System.out.println('C');
			break;
		
		case 60:
			System.out.println('B');
			break;
		
		case 80:
			System.out.println('A');
			break;
		
		default:
			System.out.println("ge�erli not giriniz");
		}
		scan.close();	
	}
}
