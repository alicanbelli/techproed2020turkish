package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// bir integer arrayin elemanlar�n� k���kten b�y��e diziniz.
		// ve ekrana iki durumu da yazd�r�n�z
		
//		int arr[]=new int[5];
		int arr[]= {2,11,9,0,23};
		System.out.println("s�ralamadan �nce " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("s�ralamadan sonra "+ Arrays.toString(arr));
	
	//char lardan olu�an bir array olu�turunuz. ascending order yap�n�z.
		
// char'lar siralanirken Java ASCII kodlari kullanir. 
// Buyuk harflerin ASCII kodlari kucuk harflerden azdir; bu yuzden siralamada
// buyuk harfler one gecer.
//Java rakamlarin ASCII kodunu o rakamin degeri gibi dusunur		

		char arr2[]= {'b','f','a','Z'};
		System.out.println("s�ralamadan �nce" + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("s�ralamadan sonra" + Arrays.toString(arr2));
	
	
//Soru: String'lerden olusan bir array olusturun ve ascending order yapin

		String arr3[]= {"Verdi","ali","123","bana","adana"};
		System.out.println("s�ralamadan �nce" + Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println("s�ralamadan sonra" + Arrays.toString(arr3));
	
	
	//boolean bir array olu�turun ve ascending order yap�n
		
		boolean arr4[]= {true,false,true};
		System.out.println(Arrays.toString(arr4));
//		Arrays.parallelSort(arr4); --> booleanlar i�in sort kullan�lmaz	
	
	}

}
