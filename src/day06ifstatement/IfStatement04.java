package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// bir tane string variable olu�turun
		// bir g�n ismini k���k harflerle de�er olarak atay�n
		// e�er atad���n�z de�er haftaii�i g�nlerinden birisi ise
		//ekrana haftai�i yazd�r�n
		//haftasonu g�nlerinden biri ise ekrana ekrana haftasonu yazd�r�n
		
		String gun= "Pazartesi";
		if(gun.equalsIgnoreCase("pazartesi") || gun.equals("sali") || gun.equals("carsamba")|| gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Haftai�i");
		}
		if(gun.equals("cumartesi")|| gun.equals("pazar") ) {
			System.out.println("haftasonu");
		}
	}

}
