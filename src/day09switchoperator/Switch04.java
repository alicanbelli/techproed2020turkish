package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre A-B-C-D YAZDIRIN
		// 0(dahil) ile 50 arasý D
		// 50 (DAHÝL) ile 60 arasý C
		//60 dahil ile 80 arasý B
		//80 DAHÝL ile 100 arasý A
		//Yanlýþ not girilirse ekrana yanlýþ not girdiniz yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen notunuzu giriniz");
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
			System.out.println("geçerli not giriniz");
		}
		scan.close();	
	}
}
