package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		// Kullanýcýdan bir gün alýn. eðer gün
		// cuma ise müslümanlar için kutsal gün
		//cumartesi için yahudiler için kutsal gün
		//pazar hristiyanlar için kutsal
		//diðer günler için kutsal gün deðil
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen bir gün giriniz");
		String gün= scan.next();
		
		if(gün.equalsIgnoreCase("Cuma")){
			System.out.println("müslümanlar için kutsal gün");
			
		}else if(gün.equalsIgnoreCase("cumartesi")){
			System.out.println("yahudiler için kutsal gün");
		}else if(gün.equalsIgnoreCase("pazar")) {
			System.out.println("hristiyanlar için kutsal gün");
		}else {
			System.out.println("kutsal gün deðil");
		}			
		scan.close();
	}
}
