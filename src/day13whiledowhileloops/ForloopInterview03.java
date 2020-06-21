package day13whiledowhileloops;

import java.util.Scanner;

public class ForloopInterview03 {

	public static void main(String[] args) {
		// kullanýcýdan birsayý alýn ve tersini ekrana yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen bir sayý giriniz");
		String num= scan.nextLine();

			for(int i= num.length()-1; i>=0;i--) {
				System.out.print(num.charAt(i));
			}
		scan.close();
	}

}
