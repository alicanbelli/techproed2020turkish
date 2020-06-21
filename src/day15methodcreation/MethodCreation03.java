package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// hesap makinas�
		//kullan�c�dan yapaca�� i�lemi sembolu ile se�mesini sa�layal�m
		//kullan�c�dan iki say� isteyelim
		//girilen iki say� ile se�ilen i�leme g�re do�ru sonucu ekrana yazd�ral�m
		
		Scanner scan=new Scanner(System.in);
			
		System.out.println("ilk say�y� giriniz");
		double num1 = scan.nextDouble();
		System.out.println("i�lem sembolunu giriniz + - * /");
		char sembol = scan.next().charAt(0);
		System.out.println("ikini say�y� giriniz");
		double num2 = scan.nextDouble();
		
		hesapMakinas�(sembol,num1,num2);
	scan.close();
	}

	public static void hesapMakinas�(char sembol,double num1,double num2) {
		
	switch(sembol) {
		case '+':
		System.out.println(num1+num2);
		break;
		case '-':
		System.out.println(num1-num2);
		break;
		case '*':
		System.out.println(num1*num2);
		break;
		case '/':
		System.out.println(num1/num2);
		break;	
		default:
			System.out.println("ge�ersiz de�er girdiniz");
	}
	
	}
	
	
}
