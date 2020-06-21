package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// hesap makinasý
		//kullanýcýdan yapacaðý iþlemi sembolu ile seçmesini saðlayalým
		//kullanýcýdan iki sayý isteyelim
		//girilen iki sayý ile seçilen iþleme göre doðru sonucu ekrana yazdýralým
		
		Scanner scan=new Scanner(System.in);
			
		System.out.println("ilk sayýyý giriniz");
		double num1 = scan.nextDouble();
		System.out.println("iþlem sembolunu giriniz + - * /");
		char sembol = scan.next().charAt(0);
		System.out.println("ikini sayýyý giriniz");
		double num2 = scan.nextDouble();
		
		hesapMakinasý(sembol,num1,num2);
	scan.close();
	}

	public static void hesapMakinasý(char sembol,double num1,double num2) {
		
	switch(sembol) {
		case '+':
		System.out.println(num1+num2);
		break;
		case '-':
		System.out.println(num1-num2);
		break;
		case '*':
		System.out.println(num1*num2);
		break;
		case '/':
		System.out.println(num1/num2);
		break;	
		default:
			System.out.println("geçersiz deðer girdiniz");
	}
	
	}
	
	
}
