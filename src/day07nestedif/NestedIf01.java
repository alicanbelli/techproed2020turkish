package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// kullanýcýdan birsayý alýn. 
		//sayý pozitif ise 9 dan büyük mü diye kontrol edin. 
		//9 dan büyük ise ekrana sayý yazdýrýn
		//9 dan küçük eþit ve 0 dan büyük eþit ise ekrana rakam yazdýrýn
		//bu sayý negatif ise ekrana sayý yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lüttfen bir tamsayý giriniz");
		
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
