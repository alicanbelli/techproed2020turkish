package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// kullan�c�dan birsay� al�n. 
		//say� pozitif ise 9 dan b�y�k m� diye kontrol edin. 
		//9 dan b�y�k ise ekrana say� yazd�r�n
		//9 dan k���k e�it ve 0 dan b�y�k e�it ise ekrana rakam yazd�r�n
		//bu say� negatif ise ekrana say� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�ttfen bir tamsay� giriniz");
		
		int num=scan.nextInt();
		 
		if(num>=0){
			if(num>9) {
				System.out.println("SAYI");
			}else if(num<=9 && num>=0) {
				System.out.println("RAKAM");
			}
		}else if(num<0){
			System.out.println("SAYI");
		}
		scan.close();
	}

}
