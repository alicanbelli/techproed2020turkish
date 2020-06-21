package day18statickeyword;

public class ThisKeyWord {
	
	int x = 12;
	static int y = 13;
	
	ThisKeyWord(int x){
		//this kullandigim zaman icinde bulundugum class'daki 
		//instance veya static variable'lara ulasmak istiyorum demektir.
		
		//this() icinde bulundugunuz class'daki parametresiz constructori
		//cagirmak icin kullanilir.
//this("Ali")icinde bulundugunuz class'daki String parametreli constructori
//cagirmak icin kullanilir
		
//this() kullanilacaksa mutlaka ilk satira yazilmalidir. Aksi takdirde
//Compile Time Error verir.
		this("Ali");
		this.x = x;		
		System.out.println("Parametreli constructor");
	}
	
	ThisKeyWord(){
		System.out.println("Parametresiz constructor");
	}
	
	ThisKeyWord(String str){
		System.out.println("String parametreli constructor");
	}
		public static void main(String[] args) {
		ThisKeyWord obj1 = new ThisKeyWord(15);
		System.out.println(obj1.x);//15
	}
}