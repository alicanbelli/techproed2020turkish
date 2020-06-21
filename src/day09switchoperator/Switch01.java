package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca ilk harf, B harfini bulunca 2. harf 
		//c harfini bulunca 3 harf, d harfini bulunca 4. harf yazdýran programý if else if ve switch kullanarak yazdýr.
		 char harf = 'B';
	switch (harf) {
		case'A':
			System.out.println("ilk harf");
			break;
		case'B':
			System.out.println("ikinci harf");
			break;
		case'C':
			System.out.println("üçüncü harf");
			break;
		case'D':
			System.out.println("dördüncü harf");
			break;
		default:
			System.out.println("bilmiyorum");
			
		}

	}

}
