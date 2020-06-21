package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýnýz.
		//sayý çift ise 
			//10 a bölünüp bölünmediðiniz kontrol ediniz
			//10 a bölünüyorsa wooow yazdýrýnýz.
			//10 a bölünmüyorsa yazýk yazdýrýnýz.
		// sayý tek ise 
			//5 e bölünüp bölünmediðiniz kontrol ediniz
			//5 e bölünüyorsa woooow 5 yazdýrýnýz 
			//5 e bölünmüyorsa yazýk 5 yazdýrýnýzz

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz.");
		
		int num = scan.nextInt();
		
		String result = (num%2==0) ? ((num%10==0)? "woooow" : "yazýk") : ((num%5==0) ? "wooow 5" : "yazýk 5");
		System.out.println(result);
		
		scan.close();
	}	

}
