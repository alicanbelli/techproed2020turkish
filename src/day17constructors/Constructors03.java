package day17constructors;

public class Constructors03 {
	static String ad = "ali can";
	static int kilo=33;
//--> eðer yukardaki gibi variable ya da method static olarak oluþturulmuþsa
//	o method ya da variable a object oluþturmadan sadece class ismini 
//	kullanarak ulaþabilisiniz.
	
	
	public static void main(String[] args) {
		 

	}

	public static void artirma(int kilo	) {
		kilo++;
		System.out.println(kilo);
	}
	
	public static void degistirme(String ad) {
		System.out.println(ad);
	}
}
