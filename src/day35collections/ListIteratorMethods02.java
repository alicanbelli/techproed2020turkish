package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		 // elemanlar� A B ve C oolan bir list olu�turunuz 
		//	bu elemanlar� AW,BW ve CW ye d�n��t�r�n�z

		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator <String>listIterator=list.listIterator();
			
			while (listIterator.hasNext()) {
				String ornekCumle =listIterator.next();
//				System.out.print(ornekCumle+"W "); bunu ge�. bu �nemli de�il
				listIterator.set(ornekCumle +"W"); //
				System.out.println(list);//--->burda en ba�taki listi yazd�rd�.
				//yani yap�lan de�i�iklikler en ba�takini etkiledi
			}
			listIterator.add("kemal");
			listIterator.add("can");
		System.out.println(list);
	}

}
