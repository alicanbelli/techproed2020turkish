package day33interface;

public class LuksHonda extends Araba implements IcAraba,DisAraba  {

	public static void main(String[] args) {
		LuksHonda l�xHonda=new LuksHonda();
			

			l�xHonda.benzin();
			l�xHonda.diesel();
			l�xHonda.direksiyon();
			l�xHonda.kapi();
			l�xHonda.klima();
			l�xHonda.koltuk();
			l�xHonda.move();
			System.out.println("i� araba interface'inden= "+IcAraba.price);
			System.out.println("d�� araba interface'inden= "+DisAraba.price);	
			System.out.println(old); //bir tane old var. 
									//o y�zden yukardaki gibi 
									//i� d�� yazmana gerek yok 
			
			l�xHonda.d��eme(); // default kullanarak body li method koyduk.
			l�xHonda.isitma();

	}

	@Override
	public void move() {
		System.out.println("3 sn.de 100 km h�za ula��r");
		
	}

	@Override
	public void kapi() {
		System.out.println("parmak izi ayarl�");

		
	}

	@Override
	public void klima() {
		System.out.println("digital klima");

		
	}

	@Override
	public void koltuk() {
		System.out.println("�s�tmal� koltuklar");

		
	}

	@Override
	public void direksiyon() {
		System.out.println("ger�ek deri direksiyon");

		
	}

}
