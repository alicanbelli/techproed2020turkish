package day33interface;

public class LuksHonda extends Araba implements IcAraba,DisAraba  {

	public static void main(String[] args) {
		LuksHonda lüxHonda=new LuksHonda();
			

			lüxHonda.benzin();
			lüxHonda.diesel();
			lüxHonda.direksiyon();
			lüxHonda.kapi();
			lüxHonda.klima();
			lüxHonda.koltuk();
			lüxHonda.move();
			System.out.println("iç araba interface'inden= "+IcAraba.price);
			System.out.println("dýþ araba interface'inden= "+DisAraba.price);	
			System.out.println(old); //bir tane old var. 
									//o yüzden yukardaki gibi 
									//iç dýþ yazmana gerek yok 
			
			lüxHonda.döþeme(); // default kullanarak body li method koyduk.
			lüxHonda.isitma();

	}

	@Override
	public void move() {
		System.out.println("3 sn.de 100 km hýza ulaþýr");
		
	}

	@Override
	public void kapi() {
		System.out.println("parmak izi ayarlý");

		
	}

	@Override
	public void klima() {
		System.out.println("digital klima");

		
	}

	@Override
	public void koltuk() {
		System.out.println("ýsýtmalý koltuklar");

		
	}

	@Override
	public void direksiyon() {
		System.out.println("gerçek deri direksiyon");

		
	}

}
