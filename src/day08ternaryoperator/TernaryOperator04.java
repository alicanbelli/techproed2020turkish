package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		// ternary operator (if else if)

		// kullan�c�dan bir tamsay� al�n�z
		// say� 0 dan b�y�k e�it ise;
			// 10 dan k���k olup olmad���n� kontrol ediniz.
			//10 dan k���k ise ekrana rakam yazd�r�n�z.
			//10 dan k���k de�ilse "pozitif say�" yazd�r�n�z.
		//say� 0 dan k���k ise negatif say� yazd�r�n�z.	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz");
		int num = scan.nextInt();
		
		String result= num>=0 ? (num<10 ? "RAKAM":"POZ�T�F SAYI") : "NEGAT�F SAYI"; 
		System.out.println(num + " " + result + " " + "'d�r");
		
		scan.close();
	}

}
