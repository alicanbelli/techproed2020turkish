package day17constructors;

public class Constructors03 {
	static String ad = "ali can";
	static int kilo=33;
//--> ešer yukardaki gibi variable ya da method static olarak olužturulmužsa
//	o method ya da variable a object olužturmadan sadece class ismini 
//	kullanarak ulažabilisiniz.
	
	
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
