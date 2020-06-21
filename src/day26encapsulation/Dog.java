package day26encapsulation;

public class Dog extends Mammal {
	public boolean sadik = true;
	public static void main(String[] args) {
		Dog dog=new Dog();// yeni obje oluþturduk 
		System.out.println("animal class tan geldi =" +dog.age);
		System.out.println("animal class tan geldi ="+dog.name);
		dog.eat();
		dog.move();
		System.out.println("mammal class tan geldi ="+dog.dogum);
		dog.feed();
		System.out.println("mammal class tan geldi ="+dog.sadik);
		dog.bark();
		
		
		
	}
 public void bark() {
	 System.out.println("köpek havlar");
 }
 
 
 
 
 
}
// dog --> mammal--> animal 
//köpeðin sülalesi oldu	