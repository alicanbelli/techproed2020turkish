package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {
// kullan�c�dan bir tamsay� girmesini isteyin, 
//tamsay� 3 basamakl� ise ekrana 3 basamakl� yazd�r�n
//3 basamakl� de�ilse �ift olup olmad���n� kontrol edin, 
//�ift ise 3 basamakl� olmayan �ift say� yazd�r�n
//�ift say� de�ilse 3 basamakl� olmayan tek say� yazd�r�n.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tamsay� giriniz");
		
		int number=scan.nextInt();
		
String sonuc=
number>=100 && number<=999 ? ("3 basamakl�"):
((number%2==0)?("3 basamakl� olmayan �ift say�"):("3 basamakl� olmayan tek say�"));

System.out.println(sonuc);	
		
	scan.close();
	}
}
