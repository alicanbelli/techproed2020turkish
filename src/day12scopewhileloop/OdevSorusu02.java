package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
// kullan�c�dan ba�lang�� ve biti� de�erlerini al�n,
//ba�lang�� de�erinden veya sonras�ndan ba�lay�p,
//biti� de�erinde veya �ncesinde biten t�m 3 ile b�l�nebilen tamsay�lar
		
		Scanner scan=new Scanner(System.in);  
		System.out.println("ba�lang�� de�erlerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("biti� de�erlerini giriniz");
		int num2 = scan.nextInt();
		int sum=1;
		if(num1>=num2) {
			System.out.println("Ba�lang�� de�eri biti� de�erinden b�y�k olmamal�d�r");
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
