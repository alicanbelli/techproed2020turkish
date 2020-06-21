package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
// List olusturun isim list01 olsun elemanlar integer olsun
		
//List'ler data type olarak primitive'leri kabul etmez
//Primitive'lerde data type'ini non-primitive yapmak icin 
//wrapper class'lari kullaniriz.

		List<Integer>list01=new ArrayList<>();
		List<Integer>list02=new ArrayList<>();
		List<Integer>list03=new ArrayList<>();
//bu listin içinde eleman olup olmadýðýný kontrol ediniz
// bunun için isEmpty methodu kullanýlýr.
//isEmpty() methodu list bos ise true, dolu ise false return eder.
		System.out.println(list01.isEmpty());
// bu liste eleman eklemek. 
		list01.add(123);
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01.isEmpty());
		list01.remove(1);
		//--> eleman atarken index kullanmak lazým
		// index 0 daki elemaný atýyor.
		System.out.println(list01);
//list deki son elemaný silme,,,list01.size() ile olur
		list01.remove(list01.size()-1);
		System.out.println(list01);
}

}
