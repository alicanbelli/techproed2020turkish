package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		//yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan bir program yaz�n�z.
		//(float) kullan�n�z
		// not :1 pi say�s� 3.14159
		// not :2 Alan: Pi*Radius*radius
		// not :3 �evre: 2*pi*Radius
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen radius de�erini giriniz.");
		
		double radius = scan.nextDouble();
		
				
				System.out.println(3.14159*radius*radius);
				System.out.println(2*3.14159*radius);
				
				
				
	scan.close();
	}
	

}
