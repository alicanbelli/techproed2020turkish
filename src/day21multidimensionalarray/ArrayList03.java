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
							//-->elemanlar i�in hata vermez
	System.out.println(list01);
System.out.println(list01.remove("Ali")); //-->true
					// bu da bir y�ntem.
					// ali oldu�u i�in ve uzakla�t�rd��� i�in true verir.

System.out.println(list01.remove("Can")); //--> can � sil diyoruz ve o da siliyor.
										// ve ekrana true yazd�r�r.
	
System.out.println(list01);
// listede sadece ay�e kald�. onun ad�n� de�i�tirmek i�in.
//ay�e i�in index, yeni eleman i�in ne istiyorsan onu yaz.
list01.set(0, "g�zelAy�e");
System.out.println(list01);
System.out.println(list01.set(0, "g�zelAy�e"));
//kenan ve zeynep eklendi.
	list01.add("kenan");
	list01.add("zeynep");
	System.out.println(list01);
	list01.clear(); //--> listenin tamam�n� silme
	System.out.println(	list01.isEmpty()); //listenin tamam�n� silmeyi kontrol
	System.out.println(list01);

		
	}

}
