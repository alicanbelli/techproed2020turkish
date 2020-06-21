package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
// kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn,
//baþlangýç deðerinden veya sonrasýndan baþlayýp,
//bitiþ deðerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayýlar
		
		Scanner scan=new Scanner(System.in);  
		System.out.println("baþlangýç deðerlerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("bitiþ deðerlerini giriniz");
		int num2 = scan.nextInt();
		int sum=1;
		if(num1>=num2) {
			System.out.println("Baþlangýç deðeri bitiþ deðerinden büyük olmamalýdýr");
		}else {
			for(int i = num1; i<=num2; i=i+1) {
				if (i%3==0) {
					sum=sum*i;
				}
			}

		}			System.out.println(sum);
scan.close();
	}
}
