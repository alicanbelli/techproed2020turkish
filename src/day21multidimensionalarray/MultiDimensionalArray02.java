package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// multidimensional array oluturup deðer atama 
		// 2.yöntem
		
		int arr [][]={ {1,2},{3}, {4,5,6} };
		System.out.println(Arrays.deepToString(arr));
	//2-3- ve 6 nýn toplamlarýný ekrana yazdýr
		
		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]);
	
	// arr arrayýndeki tüm elemanlarýn toplamýný bulan programý yazýnýz
		 
		int sum=0;
		for(int i=0; i <arr.length;i++ ){
			for(int j=0; j<arr[i].length ; j++) {
				sum= sum + arr[i][j];
				
			}
		}
		System.out.println(sum);
	}

}
