package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {

		String str1="Ay�e Candan";
	// 1. versiyon	
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(8));
		System.out.println(str1.substring(1));
	
	// 2. versiyon	

		System.out.println(str1.substring(5, 9)); // ilk rakam ekrana ��kar, 
													//ikinci ��kmaz
		System.out.println(str1.substring(6, 7));  // bo�luk
		
		System.out.println(str1.substring(7, 7));  // hata verir


	}

}
