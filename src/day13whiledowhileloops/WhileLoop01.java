package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// whileloop kullanarak ilk be� sayma say�s�n�n toplam�n� ekrana yazd�ran
		//program� yazd�r�n�z
		int sum=0;
		int num =1;
		while(num<6) {
			sum=sum+num;
			num++;
		}
		System.out.println(sum);

	}

}
