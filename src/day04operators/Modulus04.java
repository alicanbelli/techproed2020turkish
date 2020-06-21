package day04operators;

import java.util.Scanner;

public class Modulus04 {

	public static void main(String[] args) {
//4 basamaklý sayý iste ve bu tam sayýnýn rakamlarýnýz
//toplamýný ekrana yazdýran bir program hazýrlayýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamaklý bir sayý girinz");
		
		int num = scan.nextInt();
		int num1=num%10;
		int num21=num/10;
		int num2 =num21%10;
		int num31=num/100;
		int num3=num31%10;
		int num4=num/1000;
		
		System.out.println(num1+num2+num3+num4);
scan.close();
	}

}
