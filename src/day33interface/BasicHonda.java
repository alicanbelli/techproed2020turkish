package day33interface;

public class BasicHonda extends Araba implements IcAraba,DisAraba {

	public static void main(String[] args) {
		
		BasicHonda basicHonda = new BasicHonda();
			basicHonda.benzin();
			basicHonda.direksiyon();
			basicHonda.kapi();
			basicHonda.klima();
			basicHonda.koltuk();
			basicHonda.move();
			basicHonda.diesel();
			
			basicHonda.d��eme();
			basicHonda.isitma();
	}

	@Override
	public void kapi() {
		System.out.println("manuel kap� olacak");
		
	}

	@Override
	public void klima() {
		System.out.println("tek y�nl� klima");
		
	}

	@Override
	public void koltuk() {
		System.out.println("�stma olmayacak");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("yapay deri direksiyon");
		
	}

	@Override
	public void move() {
		System.out.println("10 sn.de 75 km h�z");
		
	}

}
