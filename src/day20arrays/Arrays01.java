package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
//		kullan�c�dan ka� elemanl� bir array girmesini isyetin.
//		bu arrayin t�m elemanlar�n� ekrana yazd�r�n.
//		bu arrayin ilk eleman�n� son eleman yap� ne t�m elemanlar�n� ekrana 
//		yazd�r�n.
//		mesela array{1,2,3} ise array{2,3,1} yap�n

		Scanner scan= new Scanner(System.in);
		System.out.println("ka� elemanl� bir array olu�turmak istersiniz");
		int length=scan.nextInt();
		
		
		int arr[]=new int[length];
		System.out.println("array elemanlar�n� giriniz");
		 
		for(int i=0; i<length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int arrSon[]=new int[length];
			for(int i=1; i<length;i++) {
				arrSon[i-1]=arr[i];
		}
		arrSon[length-1]=arr[0];
		System.out.println(Arrays.toString(arrSon));
		
		scan.close();
	}

}
