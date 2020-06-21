package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		//HashSet 1)Tekrarli eleman kullanimina (Duplication) izin vermez
				//        2)Key-Value yapisini kullanir. Key'ler ve Value'lar HashSet icin unique'dir.
				//          Normalde; Key'ler her zaman unique'dir, Value'lar kullanilan class'a
				//          bagli olarak unique olabilir veya olmayabilir. Kullanilan class HashSet ise 
				//          Value'lar da unique olur ama ArrayList ise unique olma zorunlulugu yoktur.

		//List'lerde add() methodu hep yeni elemani sona ekler ama HashSet'lerde
				//oyle bir zorunluluk yok.
				//HashSet'ler elemanlari ekrana rastgele yazdirir, kural yoktur.
		
		//Ayni eleman HashSet'e eklenmek istendiginde Compile Time veya Run Time Error alinmaz.
				//Son eklenen eleman ilk eklenen elemanin ustune yazilir.

		HashSet<String>hSet=new HashSet<>();
		
		hSet.add("Apple");  // ayný elemandan bir tane daha var.en 
						    //altta ikinci ekleneni ilk eklenenenin üstüne yazar.
						    //altta çýktýda gözüken en son eklenen eleman olur.
		hSet.add("Mango");
		hSet.add("Grape");		
		hSet.add("ali");		
		hSet.add("Orange");
		hSet.add("Fig");
		hSet.add("Apple");

		System.out.println(hSet);
		
		
		
		
		
	}

}
