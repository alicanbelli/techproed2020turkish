package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		// ilk be� sayma say�s�n�n �arp�m�n� ekrana yazd�ran program

		int product = 1; // �arpmada 1; toplamada 0 yaz�l�r.
		int num = 1;
				
		while(num<6) {
			product=product*num;
			num++;
		}
		System.out.println(product);
				
	}

}
