package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// kullanýcýnýn girdiði sayý için çarpým tablosunu yazdýrýnýz

		Scanner scan=new Scanner (System.in);
		System.out.println("çarpým tablosunu görmek için lütfen bir sayý giriniz");
		int num= scan.nextInt();
		
		for(int i=1; i<11;i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
			
		}
		
		System.out.println("while loop ile çözüm");
		 int num1 =1;
		 while(num1<11) {
			 System.out.println(num + "x" + num1 + "=" + (num*num1));
			 num1++;
		 }
	scan.close();
		
	}

}
