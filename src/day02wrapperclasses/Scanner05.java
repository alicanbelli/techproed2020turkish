package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		//yarýçapý kullanýcýdan alýnan bir dairenin çevresini ve alanýný hesaplayan bir program yazýnýz.
		//(float) kullanýnýz
		// not :1 pi sayýsý 3.14159
		// not :2 Alan: Pi*Radius*radius
		// not :3 çevre: 2*pi*Radius
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen radius deðerini giriniz.");
		
		double radius = scan.nextDouble();
		
				
				System.out.println(3.14159*radius*radius);
				System.out.println(2*3.14159*radius);
				
				
				
	scan.close();
	}
	

}
