package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
//		kullanýcýdan kaç elemanlý bir array girmesini isyetin.
//		bu arrayin tüm elemanlarýný ekrana yazdýrýn.
//		bu arrayin ilk elemanýný son eleman yapý ne tüm elemanlarýný ekrana 
//		yazdýrýn.
//		mesela array{1,2,3} ise array{2,3,1} yapýn

		Scanner scan= new Scanner(System.in);
		System.out.println("kaç elemanlý bir array oluþturmak istersiniz");
		int length=scan.nextInt();
		
		
		int arr[]=new int[length];
		System.out.println("array elemanlarýný giriniz");
		 
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
