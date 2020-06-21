package day16overloading;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		//kullanýcýya sayý girmesini söyleyin.
		//kullanýcýya girdiði sayýnýn rakamlarýnýn toplamýný 
		//ekrana yazdýran bir program oluþturunuz
		
		Scanner scan =new Scanner(System.in);
		System.out.println("ekrana bir sayý giriniz");
		int num = scan.nextInt();	
		
	scan.close();
	rakamToplamý(num);
	}

	public static void rakamToplamý(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
	System.out.println(sum);
	}

}
