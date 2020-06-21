package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		byte by = 101;
		int sayi= by;
		System.out.println(sayi);

		
		int sayi2=55;
		byte by2=(byte)sayi2;
		System.out.println(by2);
		
		double sayi3= 23.5;
		int by3=(int)sayi3;
		System.out.println(by3);
		
		float sayi4= -23.9f;
		short sh4=(short)sayi4;
		System.out.println(sh4);
		
		double sayi5=222.90;
		int in5=(int)sayi5;
		System.out.println(in5);
		
		double bölme = sayi2 / sayi3;
		System.out.println(bölme);
		int sayi10=(int)(sayi2 / sayi3);
		System.out.println(sayi10);		
		
		
		int sayi7=5;
		int sayi8=3;
		
		int sonuc3=sayi7/sayi8;
		System.out.println(sonuc3);
		
		
		double do21=100.235;
		int sayi11=(int)do21;
		System.out.println(sayi11 + "bu ne");
		
		int sayi9=300;
		byte bye22=(byte) sayi9;
		System.out.println(bye22);
				
		
		
		
	}

}
