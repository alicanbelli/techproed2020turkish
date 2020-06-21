package day17constructors;

import day16overloading.Constructor01;

public class Contructors02 {
// ---> buyume methodu bu class içinde deðil. bir öncekinde. müsaade etmez.
// --->eðer baþka bi class taki methodu kullanmak isterseniz 
// --->o class tan bir tane object oluþturup o object sayesinde 
//--->istediðiniz methodu kullanabilirsiniz.
	public static void main(String[] args) {

		Constructors01 obj1 = new Constructors01();
		obj1.buyume(33);
		System.out.print("yeni yol" + " ");
		Constructors01.buyume(33);
		obj1.isimDegistirme("kemalcan");
		Constructors01.isimDegistirme("yeni yol : kemalcan");
		
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		System.out.println(Constructors03.ad);//--> diðer cons tan çektik.
		
//--> eðer yukardaki gibi variable ya da method static olarak oluþturulmuþsa
//		o method ya da variable a object oluþturmadan sadece class ismini 
//		kullanarak ulaþabilisiniz.
		
		System.out.println(Constructors03.kilo);//--> diðer cons tan çektik.
		Constructors03.artirma(45);//--> diðer cons tan çektik.
		Constructors03.degistirme("ayhan");
		
	}

}
