package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// kullanýcýdan bir string alýn ve 
		// stringin indexi tek olan karakterleri yazdýr
		//almanya-->l a y
	
	Scanner scan= new Scanner(System.in);
	System.out.println("lütfen bir kelime giriniz");
	String str= scan.nextLine();
	
	int length = str.length();
	int i=1;
	
	do{
		if(i%2==1) {
			System.out.println(str.charAt(i));
		}
		i++;
	}while(i<length);
	
		
		
		
	scan.close();
	
	
	}

}
