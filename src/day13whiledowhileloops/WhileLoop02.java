package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		// ilk beþ sayma sayýsýnýn çarpýmýný ekrana yazdýran program

		int product = 1; // çarpmada 1; toplamada 0 yazýlýr.
		int num = 1;
				
		while(num<6) {
			product=product*num;
			num++;
		}
		System.out.println(product);
				
	}

}
