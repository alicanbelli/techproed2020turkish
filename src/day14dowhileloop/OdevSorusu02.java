package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// kullan�c�dan say� al�n ve say�n�n b�lenlerini ekrana yazd�r
		//�rne�in 12 nin b�lenleri 1,2,3,4,6,12 dir
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen say� giriniz");
	int num=scan.nextInt();
	
	
	System.out.println("for loop ile ��z�m");
	
	for(int i=1; i<=num;i++) {
		if(num%i==0) {
			System.out.print(i + " ");
		}
	}
	
	System.out.println("while loop ile ��z�m");

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
