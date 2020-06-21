package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// whileloop kullanarak ilk beþ sayma sayýsýnýn toplamýný ekrana yazdýran
		//programý yazdýrýnýz
		int sum=0;
		int num =1;
		while(num<6) {
			sum=sum+num;
			num++;
		}
		System.out.println(sum);

	}

}
