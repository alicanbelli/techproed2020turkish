package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// bir kullan�c�dan dikd�rtgenin en ve boyunu al�n 
		//e�er en ve boy e�it ise ekrana kare yazd�r�n
		//en ve boy farkl� ise ekrana dikd�rtgen yazd�r�n
		
		
	Scanner scan= new Scanner(System.in);
	System.out.println("kenar1 de�erini giriniz");
	double kenar1=scan.nextDouble();
	
	System.out.println("kenar2 de�erini giriniz");
	double kenar2=scan.nextDouble();
	
	if(kenar1==kenar2) {
		System.out.println("bu bir karedir");
			}
	if(kenar1!=kenar2) {
		System.out.println("bu bir dikd�rtgendir");
	}
	
	if(kenar1==kenar2) {
		System.out.println("karedir");
	}else {
		System.out.println("dikd�rtgendir");
	}
	scan.close();
	}

}
