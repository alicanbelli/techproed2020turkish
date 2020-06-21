package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		// ternary operator (if else if)

		// kullanıcıdan bir tamsayı alınız
		// sayı 0 dan büyük eşit ise;
			// 10 dan küçük olup olmadığını kontrol ediniz.
			//10 dan küçük ise ekrana rakam yazdırınız.
			//10 dan küçük değilse "pozitif sayı" yazdırınız.
		//sayı 0 dan küçük ise negatif sayı yazdırınız.	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int num = scan.nextInt();
		
		String result= num>=0 ? (num<10 ? "RAKAM":"POZİTİF SAYI") : "NEGATİF SAYI"; 
		System.out.println(num + " " + result + " " + "'dır");
		
		scan.close();
	}

}
