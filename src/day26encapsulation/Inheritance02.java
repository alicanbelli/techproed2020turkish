package day26encapsulation;

//Inheritance01 Inheritance02 nin parent ı olacak

public class Inheritance02 extends Inheritance01 {
// sağdaki parent soldaki child(önceki child)
	public static void main(String[] args) {
		
		//Inheritance01, Inheritance02'nin parent'i olacak 
		//"extends"den sonraki parent, onceki child olur		

		// TODO Auto-generated method stub

		// Child'in 1 den fazla parent'i olur mu?
				// Cevap: Olmaz. Java "multiple inheritance" i desteklemez. 
				//        Java "Single Inheritance" i destekler.
				
				//Parent'in 1 den fazla Child'i iolur mu?
				//Cevap: Olur. "Hiyerarsik Inheritance" denir.
				
				// child[a, b] --> parent[c, d, e] --> grandParent[f, g]
				// Child nelere sahip? a, b, c, d, e, f, g
				// Parent nelere sahip? c, d, e, f, g
				// grandParent nelere sahip? f, g
		
	}

}
