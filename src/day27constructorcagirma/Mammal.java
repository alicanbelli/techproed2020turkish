package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;

	public static void main(String[] args) {
		Mammal mammal =new Mammal();
	}
	public void feed() {
	System.out.println("cocuklar�n� besler");
		}
	Mammal(){
super(); //bunun anlam� parent taki parametresiz constructor � �a��r
// kullanmasak da olur ama baz�lar� kullan�r
// ilk sat�rda olmal�d�r. ayn� this() gibi.
// ikisini ayn� constructor i�inde 
//ayn� anda kullanamazs�n
		System.out.println("mammal parametresiz constructor");
	}
}	

