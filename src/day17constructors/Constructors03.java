package day17constructors;

public class Constructors03 {
	static String ad = "ali can";
	static int kilo=33;
//--> e�er yukardaki gibi variable ya da method static olarak olu�turulmu�sa
//	o method ya da variable a object olu�turmadan sadece class ismini 
//	kullanarak ula�abilisiniz.
	
	
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
