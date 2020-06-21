package day20arrays;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
// bir array in içinde belli bir elemanýn olup olmadýðýný kontrol eder
// binarySearch() bu iþi yapar
//binarySearch() ten önce sort() methodunu kullanmazsak manasýz sonuþlar verebilir

		int arr[]= {1,2,3,12,12};
		
//yukarýda verilen array da 3 eleman olarak var mý?
		
	Arrays.sort(arr);
	
	System.out.println(Arrays.binarySearch(arr,3)); //2
	
//Ayni elemandan birden fazla oldugunda ilkinin indexini verir
	
	System.out.println(Arrays.binarySearch(arr,12)); //3

//binarySearch() methodu olmayan elemanlar icin negatif sayilar return eder.
//negatif olmasi o elemanin arrayde olmadigi anlamina gelir.
//Sayi kismi ise o eleman var olsaydi kacinci eleman olurdu anlamindadir.
   
	System.out.println(Arrays.binarySearch(arr, 8));//-4
    
//-4 verir. Cunku; 8 var olsaydi
// 3 ten hemen sonra  olurdu, bu da 4. eleman demektir.
// {1,2,3,12,12}       
	
		
		
	}

}
