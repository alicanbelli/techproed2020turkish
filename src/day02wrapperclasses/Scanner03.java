package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		// kullan�c�dan al�nan bir say�n�n k�p�n� hesaplay�n�z
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("L�tfen k�p�n� almam i�in bir say� giriniz.");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(Math.pow(sayi1, 3));
		
		scan.close();
		}

}
