package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
 
		//karenin bir kenar uzunluðunu giriniz. 
		//karenin çevresini ve alanýný ekrana yazdýrýnýz
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir kenar ölçüsü giriniz.");
		
		int kenar1 = scan.nextInt();
		
		System.out.println(kenar1*kenar1);
		System.out.println(kenar1+kenar1+kenar1+kenar1);
		
		scan.close();
	}

}
