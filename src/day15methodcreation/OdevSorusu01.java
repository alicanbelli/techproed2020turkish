package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
//  kullanýcýdan sayý girmesini isteyin. 	
//sýfýr girdiðinde o ana kadar girmiþ olduðu tüm sayýlarýn toplamýný yazdýrýn
// örnek 5,4,7,0 ise toplam 16 yý ekrana yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		int num=0;
		int sum=0;
		do {
			System.out.println("bir sayý giriniz");
			num= scan.nextInt();
			sum=sum+num;
		}while(num!=0);
		
		System.out.println(sum);		
	scan.close();
	
	}
	

}
