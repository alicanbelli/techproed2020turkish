package day30exceptions;

public class TryCatch04 {
	
	public static void main(String[] args) {
		
		try {
			hop();
			
		}catch (Exception e) {
			System.out.println(e);
			//--> exception adýný ve  mesajý alýr.yazdýrýr.
			//--> exception ismini de yazdýrýr
		}
		
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
