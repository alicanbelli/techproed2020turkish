package day16overloading;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
// kullanýcýya paralelkenar,dikdörtgen ve üçgen kelimelerinden birisini seçmesini
//söyleyin. 
//hangi þekli seçerse seçsin o þeklin alanýný ve çevresini ekrana yazdýran program
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("üç þekilden birisini seçiniz");
		String sekilIsmi = scan.next().toLowerCase();
		System.out.println("iki sayý giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		alanVeCevre(sekilIsmi,num1,num2);
		scan.close();
	}

	public static void alanVeCevre (String sekilIsmi, int num1, int num2) {
		
		switch(sekilIsmi) {
		case "ucgen":
			System.out.println("alan" + (num1*num2)/2);
			System.out.println("cevre" + (num1*num2)/4);
			break;
		case "kare":
			System.out.println("alan " + num1*num1);
			System.out.println("cevre " + num1*4);
			break;
		case "dikdortgen":
			System.out.println("alan" + num1*num2);
			System.out.println("cevre" + (num1*num2)*2);
			break;
		
		default:
				System.out.println("adam gibi sayý giriniz");
		}
	}

}
