package day27constructorcagirma;

public class Dog extends Mammal {
	
	public boolean sadik= true;

	public static void main(String[] args) {

		Dog dog = new Dog(); //animal ve mammal da constructor� biz yapt�k
							// dog i�inde default constructor vard�r.
		
	}
		public void bark() {
		System.out.println("k�pekler havlar");
	}
		
		Dog(){
			super();
			System.out.println("dog parametresiz constructor");
		}
}