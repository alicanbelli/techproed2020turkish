package day17constructors;

import day16overloading.Constructor01;

public class Contructors02 {
// ---> buyume methodu bu class i�inde de�il. bir �ncekinde. m�saade etmez.
// --->e�er ba�ka bi class taki methodu kullanmak isterseniz 
// --->o class tan bir tane object olu�turup o object sayesinde 
//--->istedi�iniz methodu kullanabilirsiniz.
	public static void main(String[] args) {

		Constructors01 obj1 = new Constructors01();
		obj1.buyume(33);
		System.out.print("yeni yol" + " ");
		Constructors01.buyume(33);
		obj1.isimDegistirme("kemalcan");
		Constructors01.isimDegistirme("yeni yol : kemalcan");
		
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		System.out.println(Constructors03.ad);//--> di�er cons tan �ektik.
		
//--> e�er yukardaki gibi variable ya da method static olarak olu�turulmu�sa
//		o method ya da variable a object olu�turmadan sadece class ismini 
//		kullanarak ula�abilisiniz.
		
		System.out.println(Constructors03.kilo);//--> di�er cons tan �ektik.
		Constructors03.artirma(45);//--> di�er cons tan �ektik.
		Constructors03.degistirme("ayhan");
		
	}

}
