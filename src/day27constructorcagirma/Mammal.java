package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;

	public static void main(String[] args) {
		Mammal mammal =new Mammal();
	}
	public void feed() {
	System.out.println("cocuklarýný besler");
		}
	Mammal(){
super(); //bunun anlamý parent taki parametresiz constructor ý çaðýr
// kullanmasak da olur ama bazýlarý kullanýr
// ilk satýrda olmalýdýr. ayný this() gibi.
// ikisini ayný constructor içinde 
//ayný anda kullanamazsýn
		System.out.println("mammal parametresiz constructor");
	}
}	

