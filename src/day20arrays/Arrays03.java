package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array olu�turup bu arraylarin birbirine e�it olup olmad���n�
		//kontrol edin
//		1. elemanlar ayn� olacak
//		2.e�it elemanlar�n index leri de ayn� olmal�
//		3. {1,2,3} ve {1,2,3} e�ittir. {1,2,3} ve {1,3,2} e�it de�ildir.

		int arr1[]={1,2,3};
		int arr2[]={1,2,3};
		
		System.out.println(arr1==arr2);

	//false cunku reference'lar farkli. "==" adresleri de kontrol
	// eder. Iki array ayn� da olsa farkli iki object oldugundan 
	//ADRES leri farklidir

		System.out.println(Arrays.equals(arr1, arr2));
		
	//true verir cunku
    // Arrays.equals() methodu sadece DE�ERLER� ve INDEX leri
    // kontrol eder, adreslere bakmaz.
		
	}

}
