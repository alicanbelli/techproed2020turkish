package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		// kullanýcýdan yaþýný alýn
		//yaþ 13 den az ise çalýþamaz mesajý verin
		//yaþ 13 den 65 e kadar ise çalýþabilir mesajý verin
		//yaþ 65 ten büyük ise ekrana emekli yazdýrýn
		//negatif sayý girerse yaþ negatif olamaz desin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("yaþýnýzý girin");
		int yaþ=scan.nextInt();
		
		
		if(yaþ<0) {
			System.out.println("yaþ negatif olamaz");
		}
		else if(yaþ<13) {
			System.out.println("çalýþamaz");
		}else if(yaþ<=65) {
			System.out.println("çalýþabilir");
	}else {
		System.out.println("emekli");
	}
	
		scan.close();

	}

}
