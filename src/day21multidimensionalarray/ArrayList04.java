package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"] listini olusturun

		
		List<String>list01=new ArrayList<>();
		list01.add("Z");
		list01.add("B");
		list01.add("D");
		list01.add("D");
		
System.out.println(list01);

//listede B var mý?
System.out.println(list01.contains("B")); //-->b var mý.. var .TRUE

System.out.println(list01.contains("E"));//-->E var mý.. yok .FALSE

// listedeki ELEMANARI ALFABETÝK SIRAYA KOYMA
//list'deki elemanlari alfabetik siraya koyunuz.
//Collection ==> Bir araya getirilmis parcalar
//Bir list'deki elemanlari alfabetik siraya (Natural Order) dizmek icin 
//Collections.sort() methodu kullanilir. 
//Argument olarak list'in adini kullaniniz

		Collections.sort(list01); 
		System.out.println(list01);
	}

}
