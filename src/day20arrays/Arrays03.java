package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array oluþturup bu arraylarin birbirine eþit olup olmadýðýný
		//kontrol edin
//		1. elemanlar ayný olacak
//		2.eþit elemanlarýn index leri de ayný olmalý
//		3. {1,2,3} ve {1,2,3} eþittir. {1,2,3} ve {1,3,2} eþit deðildir.

		int arr1[]={1,2,3};
		int arr2[]={1,2,3};
		
		System.out.println(arr1==arr2);

	//false cunku reference'lar farkli. "==" adresleri de kontrol
	// eder. Iki array ayný da olsa farkli iki object oldugundan 
	//ADRES leri farklidir

		System.out.println(Arrays.equals(arr1, arr2));
		
	//true verir cunku
    // Arrays.equals() methodu sadece DEÐERLERÝ ve INDEX leri
    // kontrol eder, adreslere bakmaz.
		
	}

}
