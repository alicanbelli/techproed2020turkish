package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		// kullan�c�dan bir karakter girmesini isteyiniz.
		//karakter harf ise
			//k���k harf olup olmad���n� kontrol ediniz.
			//k���k harf ise ekrana k���k harf yazd�r�n�z.
			//b�y�k harf ise ekrana b�y�k harf yazd�r�n�z
		//karakter harf de�ilse harf de�il yazd�r�n�z
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen bir karakter giriniz.");
		char ch = scan.next().charAt(0);
		
String result= 
((ch<=122 && ch>=97) || (ch>=65 && ch<=90))?
		((ch<=122 && ch>=97) ? "k���k harf" : "b�y�k harf"): 
			"harf de�il";
		System.out.println(result);
		
		scan.close();	
	}

}
