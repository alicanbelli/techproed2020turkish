package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {
		// iki listi birle�tirmek i�in kullan�l�r.

	List<Integer>list1=new ArrayList<>();
	list1.add(11);
	list1.add(12);
	System.out.println(list1);
	
	List<Integer>list2=new ArrayList<>();
	list2.add(13);
	list2.add(14);
	list2.add(15);
	System.out.println(list2);

	list1.addAll(list2);
	System.out.println(list1); // [11, 12, 13, 14, 15]

	list1.addAll(list2);
	System.out.println(list1);//[11, 12, 13, 14, 15, 13, 14, 15]

			List<Integer>list3=new ArrayList<>();
			list3.add(1);
			System.out.println(list3);

			List<Integer>list4=new ArrayList<>();
			list4.add(2);
			list4.add(3);
			System.out.println(list4);
			
		list4.addAll(1, list3);// list 4 te 1. indexe list 3 � eklemek 
								//[2, 1, 3]
// list 3 � oldu�u gibi parantez i�erisine al tek farzet.
//	onun indexi 1 e den gelecek ona g�re yerle�tir.
//burda de�i�en list4 t�r.
		
// index kullanmadan addAll kullan�rsan�z ba� tarafa ya da son tarafa ekler

			System.out.println(list4);
			
	}

}
