package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// kullan�c�dan ismini al�n 
		// ilk harf b�y�k ise ekrana do�ru giri�
		//ilk harf k���k ise ekrana ilk harfi b�y�k giriniz yazd�r�n�z
		
		Scanner scan= new Scanner(System.in);
		String isim= "";


		do {
			System.out.println("ilk isminizi giriniz");
			isim= scan.nextLine();
			if (isim.charAt(0)>='A' && isim.charAt(0)<='Z') {
				System.out.println("do�ru giri�");
			}else {
			System.out.println("l�tfen ilk harfi b�y�k giriniz");
						
		}
		}while (!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));
		
		scan.close();	
	}

}
