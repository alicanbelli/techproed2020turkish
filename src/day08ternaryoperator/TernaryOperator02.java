package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// kullan�c�dan iki say� al�n
		//say�lar birbirine e�it ise toplamlar�n� akrana yazd�r
		//say�lar birbirinden farkl� ise �arp�mlar�n� ekrana yazd�r
		
		
		Scanner scan= new Scanner(System.in);

		System.out.println("l�tfen ilk say�y� giriniz");
		double num1 =scan.nextDouble();
		
		System.out.println("l�tfen ikinci say�y� giriniz");
		double num2=scan.nextDouble();
		
		double sonuc1 = num1==num2 ? num1+num2 : num1*num2;
		System.out.println(sonuc1);
		
	scan.close();
	}

}
