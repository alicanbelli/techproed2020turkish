package day17constructors;

public class Constructors01 {
	
	String isim="Ali can"; //---> class içinde, bunlar instance variable
	int yas= 33;
	
//not 1: method ile main method ayný class içindeyse 
//sadece ismini yazarak kullanabilirsiniz..	
	
	public static void main(String[] args) {
			buyume(33); //-->not 1 i oku....
			isimDegistirme("Ayse han");
			
			
	}
	public static void buyume(int yas) { 	//--->bunlar method(main method dýþýnda)
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistirme(String isim) {//--->bunlar method(main method dýþýnda)
		System.out.println(isim);
	}
	
	
	
	
}
