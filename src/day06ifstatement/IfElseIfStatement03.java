package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
// kullan�c�dan 6 basamakl� bir say� isteyiniz. 0 ile de ba�layabilir.
//kazanma ihtimali y�zde 20 olan; amorti ihtimali y�zde 30 olan
//kaybetme ihtimali y�zde 50 olan bir jackpot oyunu i�in bir program
		
		Scanner scan=new Scanner(System.in);
		System.out.println("6 basamakl� bir say� giriniz. 0 Ba�ta kullan�labilir");
		
		int num=scan.nextInt();
		if(num<200000) {
		System.out.println("Kazand�n�z");
		}else if(num<500000) {
		System.out.println("amorti");
		}else {
		System.out.println("kaybettiniz");
		}
		scan.close();
	}
}
