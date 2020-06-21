package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
//Array'lerde length sabittir, degistirilemez.
//ArrayList'lerde (List) length esnektir. Siz eleman ekledikce List 
//length'ini
//artirir, siz eleman sildikce List length'ini azaltir.
			
//List<String> list01 = new List<>(); ==> olmaz
//ArrayList<String> list01 = new List<>(); ==> olmaz
//ArrayList<String> list01 = new ArrayList<>(); ==> Bu olabilir ama
//asagidaki daha cok kullanilir.
//List<String> list01 = new ArrayList<String>();==> bu da olur ama 
//asagidaki daha cok kullanilir.

		
		List<String> list01=new ArrayList<>();
		System.out.println(list01);

//List'e eleman eklemek icin add() methodu kullanilir.		
		
		list01.add("ali");
		System.out.println(list01);
		list01.add("can");
		System.out.println(list01);
		list01.add("veli");
		System.out.println(list01);
		list01.add(1, "kemal");
		list01.add(0, "han");
		list01.add(5, "ayþe");

		System.out.println(list01);
		
		
		System.out.println(list01.size()); //--> uzunluðunu almak için


//list01'i [Han, Ali, Kemal, Veli, Can, Ayse] sekline getirin
			
		

	}

}
