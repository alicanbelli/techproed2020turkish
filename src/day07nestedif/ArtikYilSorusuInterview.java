package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// kullan�c�dan y�l girmesini isteyin.
		//girilen y�l art�k y�l ise ekrana art�k yil yazd�r�n
		//girilen y�l art�k y�l de�il ise ekrana art�k y�l de�il yazd�r�n.
		//art�k y�l=
		//�art 1; y�l 100 e b�l�n�rse 400 e de b�l�nmeli
					//-->1300 art�k y�l de�il,100 e b�l�n�r ama 400 e b�l�nmez
					//-->1200 art�k y�ld�r. hem y�ze hem de 400 e b�l�n�r.
		//�art 2; y�l y�ze b�l�nmezse 4 e b�l�nmeli 
					//-->100 e b�l�nmezse 4 e b�l�nmeli.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen y�l giriniz");
		int yil=scan.nextInt();
		
		String artikYil= (yil%100==0 ?(yil%400==0?"artik yil":"artik yil degil"):(yil%4==0?"artik yil":"artk yil degil"));
				
		System.out.println(artikYil);
		
		
		
//		if(yil%100==0 && yil%400==0) {
//			System.out.println(yil + " art�k y�ld�r");
//		}else if(yil%100!=0 && yil%4==0) {
//			System.out.println(yil +" art�k yild�rrrr");
//		}else{
//			System.out.println(yil + " art�k yil de�ildir");	
//		}
		scan.close();
	}
}
