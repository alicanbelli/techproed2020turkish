package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
// kullanýcýdan 6 basamaklý bir sayý isteyiniz. 0 ile de baþlayabilir.
//kazanma ihtimali yüzde 20 olan; amorti ihtimali yüzde 30 olan
//kaybetme ihtimali yüzde 50 olan bir jackpot oyunu için bir program
		
		Scanner scan=new Scanner(System.in);
		System.out.println("6 basamaklý bir sayý giriniz. 0 Baþta kullanýlabilir");
		
		int num=scan.nextInt();
		if(num<200000) {
		System.out.println("Kazandýnýz");
		}else if(num<500000) {
		System.out.println("amorti");
		}else {
		System.out.println("kaybettiniz");
		}
		scan.close();
	}
}
