package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// kullanýcý sýnav notunu tam sayý olarak isteyin
		//negatif deðer girerse yanlýþ deðer girdiniz desin
		//0 dan büyük ve eþit 50 den küçük girerse ekrana kaldýnýz yazdýrýn
		//50 den büyük eþit ve 80 den küçük ise geçtiniz yazdýrýn
		//80 den büyük eþitve 100 den küçük ise tebrikler yazdýrýn
		
	Scanner scan=new Scanner(System.in);
	System.out.println("sýnav notunuzu girer misiniz?");
		int not=scan.nextInt();
		if(not<0) {
			System.out.println("yanlýþ deðer girdiniz");
		}else if(not<=50) {
			System.out.println("kaldýnýz");
		}else if(not<=80) {
			System.out.println("geçtiniz");
		}else if(not<=100) {
			System.out.println("tebrikler");
		}else {
			System.out.println("100 den büyük girmeyiniz");
		}
		
			
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("lütfen aldýðýnýz notunuzu giriniz");
//		int sinavNotu=scan.nextInt();
//		
//		if(sinavNotu<0) {
//			System.out.println("yanlýþ deðer girdiniz");
//		}else if(sinavNotu<50){
//			System.out.println("kaldýnýz");
//		}else if(sinavNotu<80) {
//			System.out.println("Geçtiniz");
//		}else if(sinavNotu<100) {
//			System.out.println("tebrikler; geçtiniz");
//		}else {
//			System.out.println("yüzden büyük deðer girdiniz.");
//		}
	scan.close();
	}
}
