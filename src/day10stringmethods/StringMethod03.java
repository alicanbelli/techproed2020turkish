package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// charAt() belli indexteki characteri return eder.
		
//		String str1= "cimbombom";
		//str1 in 4. indexindeki charakteri bulan kod
		
	//	System.out.println(str1.charAt(4));   //--> o

//		System.out.println(str1.charAt(0));  //--> c
		
		
		//kullan�c�dan ismini isteyin.
		//isminin son harfini ekrana yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen isminizi giriniz");
		
		String isim = scan.nextLine();
		System.out.println(isim.charAt(isim.length()-1));
		
		
		scan.close();
	}

}
