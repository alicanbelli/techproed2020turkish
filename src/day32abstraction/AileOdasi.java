package day32abstraction;

public class AileOdasi extends Otel {

	public static void main(String[] args) {
		 AileOdasi müsteri2 =new AileOdasi();
		müsteri2.kahvalti();
		System.out.println("wifi ücreti= "+ müsteri2.wifi(6));
	}

	@Override
	public void kahvalti() {
		 System.out.println("kahvaltiniz kafeteryada olacaktýr.");
	}

}
