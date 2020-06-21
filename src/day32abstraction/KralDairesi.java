package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi müsteri3 = new KralDairesi();
		müsteri3.kahvalti();
		System.out.println("tv ücreti= "+ müsteri3.tv("international", 4)+ " dolar");
		System.out.println("wifi ücreti= "+ müsteri3.wifi(3)+ " dolar");

	}

	@Override
	public void kahvalti() {
		System.out.println("kahvaltýnýz teras kat kral dairesindedir.");
	}

	public int tv(String international,int saat) {
		if (international.equals("international")) {
			return saat*5;
		}else {
			return 0;
			
		}
	}
	
}
