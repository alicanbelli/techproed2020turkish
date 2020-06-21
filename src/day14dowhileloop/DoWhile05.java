package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// kullanýcýdan ismini alýn 
		// ilk harf büyük ise ekrana doðru giriþ
		//ilk harf küçük ise ekrana ilk harfi büyük giriniz yazdýrýnýz
		
		Scanner scan= new Scanner(System.in);
		String isim= "";


		do {
			System.out.println("ilk isminizi giriniz");
			isim= scan.nextLine();
			if (isim.charAt(0)>='A' && isim.charAt(0)<='Z') {
				System.out.println("doðru giriþ");
			}else {
			System.out.println("lütfen ilk harfi büyük giriniz");
						
		}
		}while (!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));
		
		scan.close();	
	}

}
