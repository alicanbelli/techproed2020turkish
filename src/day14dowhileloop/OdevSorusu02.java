package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// kullanýcýdan sayý alýn ve sayýnýn bölenlerini ekrana yazdýr
		//örneðin 12 nin bölenleri 1,2,3,4,6,12 dir
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen sayý giriniz");
	int num=scan.nextInt();
	
	
	System.out.println("for loop ile çözüm");
	
	for(int i=1; i<=num;i++) {
		if(num%i==0) {
			System.out.print(i + " ");
		}
	}
	
	System.out.println("while loop ile çözüm");

	int i = 1;
	while(i<=num) {
		if(num%i==0) {
			System.out.print(i + " ");
		}
		i++;
		}
	
	
	scan.close();
	
	}

}
