package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		// bir char variable oluþturun
		//bir büyük harf deðer atayýn
		//eðer atanan deðer haftanýn günlerinden herhangi birinin ilk harfi ise 
		//o günleri yazdýrýn
		//eðer atanan deðer haftanýn günlerinden herhangi birinin ilk harfi deðil
		// ise böyle bir gün yok yazdýrýn ekrana.
		
		char gun = 'S';
		if(gun=='P') {
			System.out.println("pazar,pazartesi perþembe"); 
		}
		if(gun=='S') {
			System.out.println("sali");
}
		if(gun=='C') {
			System.out.println("carsamba,cuma,cumartesi");
		}
		if(gun!='P'&& gun!='S'&& gun!='C') {
			System.out.println("böyle bir gün yok");
		}
			
		
	}

}
