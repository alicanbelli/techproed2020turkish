package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
//	bir önceki class tan constructor çekip deðiþiklik yapýyoruz
		Constructor01 hondaAraba01=new Constructor01();
		System.out.println("Zamlý fiyat :" + (hondaAraba01.price + 1000));
		System.out.println("year :" + (hondaAraba01.year - 1));
		System.out.println("make :" + hondaAraba01.make.replace ("honda", "Toyota"));
		System.out.println("type :" + hondaAraba01.type.replace ("civic","camry"));

		Constructor01 hondaAraba02=new Constructor01();
		System.out.println("Zamlý fiyat :" + (hondaAraba02.price + 1000));
	}
}
