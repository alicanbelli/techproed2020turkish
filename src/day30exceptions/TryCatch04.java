package day30exceptions;

public class TryCatch04 {
	
	public static void main(String[] args) {
		
		try {
			hop();
			
		}catch (Exception e) {
			System.out.println(e);
			//--> exception ad�n� ve  mesaj� al�r.yazd�r�r.
			//--> exception ismini de yazd�r�r
		}
		
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
