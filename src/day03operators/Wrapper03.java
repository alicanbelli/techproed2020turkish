package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		//kullan�c�dan ad ve soyad�n� al�p ekrana yazd�ral�m
		//kullan�c�dan adresini al�p ekrana yazd�ral�m
		//kullan�c�dan ya��n� al�p ekrana yazd�ral�m
		//kullan�c�ya "T�rkiyede ya��yorum, Do�ru / yanl�� " diye soral�m, ekrana cevab�n� 
		//true /false olarak yazd�ral�m
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Ad�n�z� soyad�n�z� s�yler misiniz?");
		String ad�Soyad�=scan.nextLine();
		System.out.println(ad�Soyad�);

		System.out.println("adresinizi s�yler misiniz?");
		String adres=scan.nextLine();
		System.out.println(adres);
		
		System.out.println("ya��n�z� s�yler misiniz?");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("T�rkiyede ya��yorum, true / false ");
		boolean t�rkiyedeYa��yorumDo�ruYanl�s  = scan.nextBoolean();
		System.out.println(t�rkiyedeYa��yorumDo�ruYanl�s);
		
		scan.close();
	}

}
