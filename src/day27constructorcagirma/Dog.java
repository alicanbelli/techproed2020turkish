package day27constructorcagirma;

public class Dog extends Mammal {
	
	public boolean sadik= true;

	public static void main(String[] args) {

		Dog dog = new Dog(); //animal ve mammal da constructorý biz yaptýk
							// dog içinde default constructor vardýr.
		
	}
		public void bark() {
		System.out.println("köpekler havlar");
	}
		
		Dog(){
			super();
			System.out.println("dog parametresiz constructor");
		}
}