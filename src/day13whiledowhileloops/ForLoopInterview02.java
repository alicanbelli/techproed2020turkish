package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// kullan�c�dan bir stiring al�n ve bu stiringi ekrana tersten yazd�r�n.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir c�mle veya kelime giriniz");
		
		String str=scan.nextLine();
		
		int length = str.length()-1;
		while(length >= 0) {
			System.out.print(str.charAt(length));
		length--;
		
		}
				
		scan.close();
		
	}

}
