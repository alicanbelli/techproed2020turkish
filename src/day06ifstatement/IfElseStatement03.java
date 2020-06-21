package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// kullanýcýdan alacaðý ürün miktarýný ve fiyatýný alalým
		//eðer kullanýcý 1000 den fazla ürün alýrsa yüzde 20 indirim yapan 
		// ve kullanýcýýnýn ödeyeceði toplam fiyatý ekrana yazdýrýn
		//eðer kullanýcý 1000 den az ya da 1000 ürün alýrsa indirim yapmayýn 
		// ve kullanýcýýnýn ödeyeceði toplam fiyatý ekrana yazdýrýn
		//para konularda double kullanmamak lazým
		//yüzde indirim yapma= 60 tl.nin inmiþ hali 60*80 /100
		
		Scanner scan=new Scanner (System.in);
		System.out.println("alacaðýnýz ürün miktarýný giriniz.");
		double miktar =scan.nextDouble();
		
		System.out.println("alacaðýnýz ürün fiyatýný giriniz.");
		double fiyat=scan.nextDouble();
		
		if (miktar>1000) {
			System.out.println(miktar*(fiyat*80)/100);
		}else {
			System.out.println(miktar*fiyat);
		}
	scan.close();	
	}

}
