package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		// kullan�c�dan ya��n� al�n
		//ya� 13 den az ise �al��amaz mesaj� verin
		//ya� 13 den 65 e kadar ise �al��abilir mesaj� verin
		//ya� 65 ten b�y�k ise ekrana emekli yazd�r�n
		//negatif say� girerse ya� negatif olamaz desin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ya��n�z� girin");
		int ya�=scan.nextInt();
		
		
		if(ya�<0) {
			System.out.println("ya� negatif olamaz");
		}
		else if(ya�<13) {
			System.out.println("�al��amaz");
		}else if(ya�<=65) {
			System.out.println("�al��abilir");
	}else {
		System.out.println("emekli");
	}
	
		scan.close();

	}

}
