package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// kullan�c�dan say� al�n 
		//say� 10 dan k���k ise ekrana kazand�n�z
		//say� 10 veya 10 dan b�y�k ise tekrar dene yazd�r
		
		int num = 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz");
		num = scan.nextInt();


		if (num<10) {
			System.out.println("kazandiniz");
		}else if (num>=10) {
			System.out.println("tekrar dene");
		}
		
		
		
		
		scan.close();
		}
		}
