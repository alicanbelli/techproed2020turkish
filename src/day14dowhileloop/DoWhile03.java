package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// kullanýcýdan sayý alýn 
		//sayý 10 dan küçük ise ekrana kazandýnýz
		//sayý 10 veya 10 dan büyük ise tekrar dene yazdýr
		
		int num = 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz");
		num = scan.nextInt();


		if (num<10) {
			System.out.println("kazandiniz");
		}else if (num>=10) {
			System.out.println("tekrar dene");
		}
		
		
		
		
		scan.close();
		}
		}
