package day30exceptions;

public class TryCatch05 {
	
	public static void main(String[] args) {
		
		try {
			hop();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			//--> e.getMessage sadece mesajý alýr.yazdýrýr.
			//--> exception ismini yazdýrmaz
		}		
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
