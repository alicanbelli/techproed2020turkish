package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// for each loop for loop un zenginleþtirilmiþ methodudur.
		//diðer adý enhenced for loop tur. zenginleþtirilmiþ.
	//for each loop daha kullanýþlý ve çok kullanýlýr.

		int arr[]= {12,21,13,43};
			for(int i=0;i<arr.length; i++) {
				System.out.println(arr[i]);
			}

		for(int w:arr) {
			System.out.println(w);
		}
			
//String içeren bir array oluþturun elemanlarýný yan yana 
//aralarýna boþluk koyarak for each loop ile yazdýrýnýz
		
		String arr2[]= {"Ali ","Can ","veli"};
		for(String w: arr2) {
		System.out.print(w + " ");	
		}
// integer elemanlar içeren bir list oluþturun. for each loop kullanarak 
// bu elemanlarýn toplamýný ekrana yazdýrýnýz
		
		List<Integer>list02=new ArrayList<>();
		list02.add(11);
		list02.add(21);
		list02.add(33);
		list02.add(23);

	System.out.println(list02);

		int sum = 0;
		for(int w : list02) {
			sum =sum +w;
			
		}
	System.out.println(sum);	
		
		
// {{1,2}{5}{6,7,8}} arrayindeki elemanlarýn toplamýný yazýnýz	
		
		int arr3[][]={{100},{5},{6,7,18}};
		int sum3 = 0;
		
		for(int[]w : arr3) {
			for(int z : w) {
				sum3 = sum3 +z;
			}
		}
		System.out.println(sum3);
		
	}

}
