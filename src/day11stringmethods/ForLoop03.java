package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// ilk 4 sayma say�s�n�n �arp�m�n� veren for loop olu�tur
		//----> �arpmada 1 den ba�lan�r.
		int product =1;
		for(int i =1; i<5; i++) {
			product = product*i;
		}
		System.out.println(product);

	//ilk 10 sayma say�s�n�n �arp�m�n� veren loop
		
		int prod=1;
		for(int i2=2; i2<13; i2+=2) {
			prod= prod*i2;
		}
	System.out.println(prod);
	
	
	
	// 9! hesaplayan program� for loop kullanarak yap�n�z
	
	int product1=1;
	for(int i3=9; i3>0; i3--) {
		product1=product1*i3;
	}
	
	System.out.println(product1);
	}

}
