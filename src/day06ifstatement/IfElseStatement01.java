package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// kullan�c�dan password girmesini isteyin
		//password dogru ise ekrana password dogru yazd�r�n
		//password yanl�� ise ekrana passwod yanl�� tekrar deneyin yazd�r�n
		//dogru password=Java2020

		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen Password giriniz");
		String password=scan.next();
		if(password.equals("java2020")) {
			System.out.println("Password do�ru");
		}else {
			System.out.println("Password yanl�� tekrar deneyin");
		}
	scan.close();
	}

}
