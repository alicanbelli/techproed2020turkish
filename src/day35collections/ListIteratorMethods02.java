package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		 // elemanlarý A B ve C oolan bir list oluþturunuz 
		//	bu elemanlarý AW,BW ve CW ye dönüþtürünüz

		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator <String>listIterator=list.listIterator();
			
			while (listIterator.hasNext()) {
				String ornekCumle =listIterator.next();
//				System.out.print(ornekCumle+"W "); bunu geç. bu önemli deðil
				listIterator.set(ornekCumle +"W"); //
				System.out.println(list);//--->burda en baþtaki listi yazdýrdý.
				//yani yapýlan deðiþiklikler en baþtakini etkiledi
			}
			listIterator.add("kemal");
			listIterator.add("can");
		System.out.println(list);
	}

}
