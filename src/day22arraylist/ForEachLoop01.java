package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// for each loop for loop un zenginle�tirilmi� methodudur.
		//di�er ad� enhenced for loop tur. zenginle�tirilmi�.
	//for each loop daha kullan��l� ve �ok kullan�l�r.

		int arr[]= {12,21,13,43};
			for(int i=0;i<arr.length; i++) {
				System.out.println(arr[i]);
			}

		for(int w:arr) {
			System.out.println(w);
		}
			
//String i�eren bir array olu�turun elemanlar�n� yan yana 
//aralar�na bo�luk koyarak for each loop ile yazd�r�n�z
		
		String arr2[]= {"Ali ","Can ","veli"};
		for(String w: arr2) {
		System.out.print(w + " ");	
		}
// integer elemanlar i�eren bir list olu�turun. for each loop kullanarak 
// bu elemanlar�n toplam�n� ekrana yazd�r�n�z
		
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
		
		
// {{1,2}{5}{6,7,8}} arrayindeki elemanlar�n toplam�n� yaz�n�z	
		
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
