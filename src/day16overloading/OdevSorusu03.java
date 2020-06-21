package day16overloading;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
// kullan�c�ya paralelkenar,dikd�rtgen ve ��gen kelimelerinden birisini se�mesini
//s�yleyin. 
//hangi �ekli se�erse se�sin o �eklin alan�n� ve �evresini ekrana yazd�ran program
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("�� �ekilden birisini se�iniz");
		String sekilIsmi = scan.next().toLowerCase();
		System.out.println("iki say� giriniz");
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
				System.out.println("adam gibi say� giriniz");
		}
	}

}
