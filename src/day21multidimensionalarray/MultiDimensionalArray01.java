package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// multidimensional array
		
	int arr[][]=new int[3][4];
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.deepToString(arr));
	
//de�er atama 1. y�ntem
	arr[0][0]=1;
	arr[0][1]=2;
	arr[0][2]=3;
	arr[0][3]=4;
	arr[1][0]=5;
	arr[1][1]=6;
	arr[1][2]=7;
	arr[1][3]=8;
	arr[2][0]=9;
	arr[2][1]=10;
	arr[2][2]=11;
	arr[2][3]=12;
	System.out.println(Arrays.deepToString(arr));
	
	System.out.println(arr[1][2]);
	System.out.println(arr[0][3] + arr[2][1]);
	System.out.println(arr[0][3] * arr[2][1]);
}

}
