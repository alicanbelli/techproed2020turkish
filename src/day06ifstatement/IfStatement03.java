package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		// bir char variable olu�turun
		//bir b�y�k harf de�er atay�n
		//e�er atanan de�er haftan�n g�nlerinden herhangi birinin ilk harfi ise 
		//o g�nleri yazd�r�n
		//e�er atanan de�er haftan�n g�nlerinden herhangi birinin ilk harfi de�il
		// ise b�yle bir g�n yok yazd�r�n ekrana.
		
		char gun = 'S';
		if(gun=='P') {
			System.out.println("pazar,pazartesi per�embe"); 
		}
		if(gun=='S') {
			System.out.println("sali");
}
		if(gun=='C') {
			System.out.println("carsamba,cuma,cumartesi");
		}
		if(gun!='P'&& gun!='S'&& gun!='C') {
			System.out.println("b�yle bir g�n yok");
		}
			
		
	}

}
