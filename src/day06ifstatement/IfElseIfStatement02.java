package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// kullan�c� s�nav notunu tam say� olarak isteyin
		//negatif de�er girerse yanl�� de�er girdiniz desin
		//0 dan b�y�k ve e�it 50 den k���k girerse ekrana kald�n�z yazd�r�n
		//50 den b�y�k e�it ve 80 den k���k ise ge�tiniz yazd�r�n
		//80 den b�y�k e�itve 100 den k���k ise tebrikler yazd�r�n
		
	Scanner scan=new Scanner(System.in);
	System.out.println("s�nav notunuzu girer misiniz?");
		int not=scan.nextInt();
		if(not<0) {
			System.out.println("yanl�� de�er girdiniz");
		}else if(not<=50) {
			System.out.println("kald�n�z");
		}else if(not<=80) {
			System.out.println("ge�tiniz");
		}else if(not<=100) {
			System.out.println("tebrikler");
		}else {
			System.out.println("100 den b�y�k girmeyiniz");
		}
		
			
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("l�tfen ald���n�z notunuzu giriniz");
//		int sinavNotu=scan.nextInt();
//		
//		if(sinavNotu<0) {
//			System.out.println("yanl�� de�er girdiniz");
//		}else if(sinavNotu<50){
//			System.out.println("kald�n�z");
//		}else if(sinavNotu<80) {
//			System.out.println("Ge�tiniz");
//		}else if(sinavNotu<100) {
//			System.out.println("tebrikler; ge�tiniz");
//		}else {
//			System.out.println("y�zden b�y�k de�er girdiniz.");
//		}
	scan.close();
	}
}
