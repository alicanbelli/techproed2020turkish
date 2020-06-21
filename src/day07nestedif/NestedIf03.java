package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		// kullanýcýdan yýl girmesini isteyin.
				//girilen yýl artýk yýl ise ekrana artýk yil yazdýrýn
				//girilen yýl artýk yýl deðil ise ekrana artýk yýl deðil yazdýrýn.
				//artýk yýl=
				//þart 1; yýl 100 e bölünürse 400 e de bölünmeli
							//-->1300 artýk yýl deðil,100 e bölünür ama 400 e bölünmez
							//-->1200 artýk yýldýr. hem yüze hem de 400 e bölünür.
				//þart 2; yýl yüze bölünmezse 4 e bölünmeli 
							//-->100 e bölünmezse 4 e bölünmeli.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("yýl giriniz");
		
		int yil = scan.nextInt();
		
		if(yil%100==0) {
			if(yil%400==0) {
				System.out.println("artýk yýl");
		}else {
				System.out.println("artýk yýldeðil");
			}
				}else if(yil%100!=0) {
			if(yil%4==0) {
				System.out.println("artýk yýl");
		}else {
				System.out.println("artýk yýl deðil");
			}
		}
		
		scan.close();
	}

}
