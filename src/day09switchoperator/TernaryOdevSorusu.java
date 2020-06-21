package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {
// kullanıcıdan bir tamsayı girmesini isteyin, 
//tamsayı 3 basamaklı ise ekrana 3 basamaklı yazdırın
//3 basamaklı değilse çift olup olmadığını kontrol edin, 
//çift ise 3 basamaklı olmayan çift sayı yazdırın
//çift sayı değilse 3 basamaklı olmayan tek sayı yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tamsayı giriniz");
		
		int number=scan.nextInt();
		
String sonuc=
number>=100 && number<=999 ? ("3 basamaklı"):
((number%2==0)?("3 basamaklı olmayan çift sayı"):("3 basamaklı olmayan tek sayı"));

System.out.println(sonuc);	
		
	scan.close();
	}
}
