package day17constructors;

public class Constructors04 {
	
	int num1=12;
	static int num2=22;
	
	public static void main(String[] args) {
		num2++;//--> num2 static oldu�u i�in main method i�inde kullan�l�r.
	//num1++; //--> num1 static olmad��� i�in main method i�inde kullan�lamaz
	//static methodlar�n i�inde sadece static elemanlar kullan�labilir.
	System.out.println(num2);
	
	}

}
