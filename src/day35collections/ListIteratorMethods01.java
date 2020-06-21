package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
//		elemanlar� A B ve C olan bir list olu�turun
		
		
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
// list �terator olu�turun ve ekrana yazd�r�n
		ListIterator<String>listIterator=list.listIterator();

		while (listIterator.hasNext()) {
			Object eleman=listIterator.next();
			System.out.print(eleman + " ");
		}
		//hasPrevious() ve previous() methodlarini kullanarak
				//bir listin elemanlarini tersten yazdirmak isterseniz mutlaka
				//once hasNext() ve next() kullanmalisiniz

		while (listIterator.hasPrevious()) {
			Object eleman2=listIterator.previous();
			System.out.print(eleman2+" ");
			
		}
	}

}
