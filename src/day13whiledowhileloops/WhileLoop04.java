package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// kullan�c�n�n girdi�i say� i�in �arp�m tablosunu yazd�r�n�z

		Scanner scan=new Scanner (System.in);
		System.out.println("�arp�m tablosunu g�rmek i�in l�tfen bir say� giriniz");
		int num= scan.nextInt();
		
		for(int i=1; i<11;i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
			
		}
		
		System.out.println("while loop ile ��z�m");
		 int num1 =1;
		 while(num1<11) {
			 System.out.println(num + "x" + num1 + "=" + (num*num1));
			 num1++;
		 }
	scan.close();
		
	}

}
