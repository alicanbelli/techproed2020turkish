package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
 
		//karenin bir kenar uzunlu�unu giriniz. 
		//karenin �evresini ve alan�n� ekrana yazd�r�n�z
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen bir kenar �l��s� giriniz.");
		
		int kenar1 = scan.nextInt();
		
		System.out.println(kenar1*kenar1);
		System.out.println(kenar1+kenar1+kenar1+kenar1);
		
		scan.close();
	}

}
