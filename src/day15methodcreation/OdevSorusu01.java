package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
//  kullan�c�dan say� girmesini isteyin. 	
//s�f�r girdi�inde o ana kadar girmi� oldu�u t�m say�lar�n toplam�n� yazd�r�n
// �rnek 5,4,7,0 ise toplam 16 y� ekrana yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		int num=0;
		int sum=0;
		do {
			System.out.println("bir say� giriniz");
			num= scan.nextInt();
			sum=sum+num;
		}while(num!=0);
		
		System.out.println(sum);		
	scan.close();
	
	}
	

}
