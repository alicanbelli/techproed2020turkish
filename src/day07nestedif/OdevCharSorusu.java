package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
// kullan�c�dan bir character al�n 
//al�nan character bir harf ise ekrana harf yazd�r�n
//di�er durumlarda ekrana harf de�il yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir char de�eri giriniz");
		char harf=scan.next().charAt(0);
				
		if ((harf<=90 && harf>=65) || (harf<=122 && harf>=97)) {
			System.out.println("HARF");
		}else
			System.out.println("HARF DE��LD�R");
scan.close();
	}

}
