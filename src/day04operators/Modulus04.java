package day04operators;

import java.util.Scanner;

public class Modulus04 {

	public static void main(String[] args) {
//4 basamakl� say� iste ve bu tam say�n�n rakamlar�n�z
//toplam�n� ekrana yazd�ran bir program haz�rlay�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamakl� bir say� girinz");
		
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
