package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		// Kullan�c�dan bir g�n al�n. e�er g�n
		// cuma ise m�sl�manlar i�in kutsal g�n
		//cumartesi i�in yahudiler i�in kutsal g�n
		//pazar hristiyanlar i�in kutsal
		//di�er g�nler i�in kutsal g�n de�il
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen bir g�n giriniz");
		String g�n= scan.next();
		
		if(g�n.equalsIgnoreCase("Cuma")){
			System.out.println("m�sl�manlar i�in kutsal g�n");
			
		}else if(g�n.equalsIgnoreCase("cumartesi")){
			System.out.println("yahudiler i�in kutsal g�n");
		}else if(g�n.equalsIgnoreCase("pazar")) {
			System.out.println("hristiyanlar i�in kutsal g�n");
		}else {
			System.out.println("kutsal g�n de�il");
		}			
		scan.close();
	}
}
