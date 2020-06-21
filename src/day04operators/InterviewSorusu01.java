package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		// iki tane variable'ýn deðerlerini yer deðiþtiriniz.
		
		//1. yol
		
		Scanner scan=new Scanner(System.in);
		//System.out.println("yerlerini deðiþtirmek için iki sayi giriniz.");
		
		//double sayi10=scan.nextDouble();
		//double sayi20=scan.nextDouble();
		
		//double gecici1=0.0;
		//gecici1=sayi10;
		//sayi10=sayi20;
		//sayi20=gecici1;
		//System.out.println(sayi10);
		//System.out.println(sayi20);		
		
//2.yol
		//double sayi1=12;
		//double sayi2=30;
		//double gecici=sayi1;
		//sayi1=sayi2;
		//sayi2=gecici;
		//System.out.println(sayi1);
		//System.out.println(sayi2);
		//System.out.println(gecici);
//3.yol
	
		System.out.println("yer deðiþtirmek için iki sayý giriniz");
		double sayi30=scan.nextDouble();
		double sayi40=scan.nextDouble();
		sayi30=sayi40+sayi30;
		sayi40=sayi30-sayi40;
		sayi30=sayi30-sayi40;
		System.out.println(sayi30);
		System.out.println(sayi40);
		
		scan.close();
		
	}

}
