package day16overloading;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		//kullan�c�ya say� girmesini s�yleyin.
		//kullan�c�ya girdi�i say�n�n rakamlar�n�n toplam�n� 
		//ekrana yazd�ran bir program olu�turunuz
		
		Scanner scan =new Scanner(System.in);
		System.out.println("ekrana bir say� giriniz");
		int num = scan.nextInt();	
		
	scan.close();
	rakamToplam�(num);
	}

	public static void rakamToplam�(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
	System.out.println(sum);
	}

}
