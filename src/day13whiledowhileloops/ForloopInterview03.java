package day13whiledowhileloops;

import java.util.Scanner;

public class ForloopInterview03 {

	public static void main(String[] args) {
		// kullan�c�dan birsay� al�n ve tersini ekrana yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen bir say� giriniz");
		String num= scan.nextLine();

			for(int i= num.length()-1; i>=0;i--) {
				System.out.print(num.charAt(i));
			}
		scan.close();
	}

}
