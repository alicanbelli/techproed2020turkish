package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý alýn
		//sayýlar birbirine eþit ise toplamlarýný akrana yazdýr
		//sayýlar birbirinden farklý ise çarpýmlarýný ekrana yazdýr
		
		
		Scanner scan= new Scanner(System.in);

		System.out.println("lütfen ilk sayýyý giriniz");
		double num1 =scan.nextDouble();
		
		System.out.println("lütfen ikinci sayýyý giriniz");
		double num2=scan.nextDouble();
		
		double sonuc1 = num1==num2 ? num1+num2 : num1*num2;
		System.out.println(sonuc1);
		
	scan.close();
	}

}
