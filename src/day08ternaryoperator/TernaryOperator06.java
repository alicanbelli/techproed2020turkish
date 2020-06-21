package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n�z.
		//say� �ift ise 
			//10 a b�l�n�p b�l�nmedi�iniz kontrol ediniz
			//10 a b�l�n�yorsa wooow yazd�r�n�z.
			//10 a b�l�nm�yorsa yaz�k yazd�r�n�z.
		// say� tek ise 
			//5 e b�l�n�p b�l�nmedi�iniz kontrol ediniz
			//5 e b�l�n�yorsa woooow 5 yazd�r�n�z 
			//5 e b�l�nm�yorsa yaz�k 5 yazd�r�n�zz

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz.");
		
		int num = scan.nextInt();
		
		String result = (num%2==0) ? ((num%10==0)? "woooow" : "yaz�k") : ((num%5==0) ? "wooow 5" : "yaz�k 5");
		System.out.println(result);
		
		scan.close();
	}	

}
