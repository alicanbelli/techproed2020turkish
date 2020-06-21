package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// bir tane string variable oluþturun
		// bir gün ismini küçük harflerle deðer olarak atayýn
		// eðer atadýðýnýz deðer haftaiiçi günlerinden birisi ise
		//ekrana haftaiçi yazdýrýn
		//haftasonu günlerinden biri ise ekrana ekrana haftasonu yazdýrýn
		
		String gun= "Pazartesi";
		if(gun.equalsIgnoreCase("pazartesi") || gun.equals("sali") || gun.equals("carsamba")|| gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Haftaiçi");
		}
		if(gun.equals("cumartesi")|| gun.equals("pazar") ) {
			System.out.println("haftasonu");
		}
	}

}
