package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca ilk harf, B harfini bulunca 2. harf 
		//c harfini bulunca 3 harf, d harfini bulunca 4. harf yazd�ran program� if else if ve switch kullanarak yazd�r.
		 char harf = 'B';
	switch (harf) {
		case'A':
			System.out.println("ilk harf");
			break;
		case'B':
			System.out.println("ikinci harf");
			break;
		case'C':
			System.out.println("���nc� harf");
			break;
		case'D':
			System.out.println("d�rd�nc� harf");
			break;
		default:
			System.out.println("bilmiyorum");
			
		}

	}

}
