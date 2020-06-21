package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"] olusturun.

	List<String>list01= new ArrayList<>();	
	list01.add("Ali");
	list01.add("Can");
	list01.add("Ayse");
	list01.add("Ali");
System.out.println(list01);
	list01.remove("Ali");
	System.out.println(list01);
	
	list01.remove("kemal"); // --> remove methodu listede olmayan 
							//-->elemanlar için hata vermez
	System.out.println(list01);
System.out.println(list01.remove("Ali")); //-->true
					// bu da bir yöntem.
					// ali olduðu için ve uzaklaþtýrdýðý için true verir.

System.out.println(list01.remove("Can")); //--> can ý sil diyoruz ve o da siliyor.
										// ve ekrana true yazdýrýr.
	
System.out.println(list01);
// listede sadece ayþe kaldý. onun adýný deðiþtirmek için.
//ayþe için index, yeni eleman için ne istiyorsan onu yaz.
list01.set(0, "güzelAyþe");
System.out.println(list01);
System.out.println(list01.set(0, "güzelAyþe"));
//kenan ve zeynep eklendi.
	list01.add("kenan");
	list01.add("zeynep");
	System.out.println(list01);
	list01.clear(); //--> listenin tamamýný silme
	System.out.println(	list01.isEmpty()); //listenin tamamýný silmeyi kontrol
	System.out.println(list01);

		
	}

}
