package day17constructors;

public class Constructors01 {
	
	String isim="Ali can"; //---> class i�inde, bunlar instance variable
	int yas= 33;
	
//not 1: method ile main method ayn� class i�indeyse 
//sadece ismini yazarak kullanabilirsiniz..	
	
	public static void main(String[] args) {
			buyume(33); //-->not 1 i oku....
			isimDegistirme("Ayse han");
			
			
	}
	public static void buyume(int yas) { 	//--->bunlar method(main method d���nda)
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistirme(String isim) {//--->bunlar method(main method d���nda)
		System.out.println(isim);
	}
	
	
	
	
}
