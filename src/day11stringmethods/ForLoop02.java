package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
// 100 den k���k 3 �n kat� olan sayma say�lar�n� yan yana yazd�ran program
		
		for(int i=3; i<100; i+=3) {
			System.out.println(i + " ");	
			}
		
//ilk 5 sayma say�s�n�n toplam�n� veren program�
		
		int sum=0;
		for(int i = 1; i<6; i++) {
			sum = sum + i;
		}
		
		System.out.print("Toplam : " +sum);

//10 dan b�y�k ilk �� sayma say�s�n�n toplam�n� veren bir loop yaz�n�z
		
		int sum2 =0;
		for (int i2 =11; i2<14; i2++) {
			sum2 = sum2 +i2;	
		}
		System.out.println("Toplam : " +sum2);
		
// 20 den b�y�k ilk 5 sayma say�s�n�n toplam�n� veren for loop yap�n�z
		
		int sum4 =0;
		for(int i =21; i<26; i++) {
			sum4 = sum4 + i;
		}
			System.out.println(sum4);	
			
// ilk 50 sayma say�s�n�n toplam�n� veren for loop program yaz�n�z
			
			int sum8 =0;
			for(int i5=1; i5<51; i5++ ) {
				sum8 = sum8 +i5;			}
			System.out.println("toplam :" +sum8);

// 5 ile b�l�nebilen 100 den k���k sayma say�lar�n�n toplam�
			
			int sum6=0;
			for(int i0=5; i0<100; i0+=5 ) {
				sum6=sum6+i0;
			}
			System.out.println(sum6);
	}
}
