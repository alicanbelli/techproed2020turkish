package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// kullan�c�dan bir tamsay� isteyin
		//o tam say�n�n mutlak de�erini ekrana yazd�r�n.
		//mutlak de�er say�n�n kendi i�areti ile �arp�lmas�d�r.
		//-3 �n mutlak de�eri -1*-3=3
		// +5 in mutlak de�eri +1*+5=5
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tam say� giriniz.");
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num*(+1));
		}else {
			System.out.println(num*(-1));
		}
		scan.close();
	}
}
