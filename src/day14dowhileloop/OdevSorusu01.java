package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// kullan�c�dan bir string de�er al�n ve bu stringin
		//ilk harfi ile son harfinin yerlerini de�i�tirerek ekrana yazd�r�n
		// java girilirse -->aavj gibi...
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir kelime giriniz");
		String str=scan.nextLine();
		
		char ilk= str.charAt(0);
		char son= str.charAt(str.length()-1);
		
		System.out.println(son + str.substring(1, str.length()-1) + ilk);
		
		
		scan.close();
	}

}
