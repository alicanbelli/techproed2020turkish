package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String str = "Ali Can okula başladı";
		
		String kelime [] = str.split("a");
		
	System.out.println(Arrays.toString(kelime));
	System.out.println(kelime.length);
		
		String str2 ="kahramanmaraş";
		String harf[]=str2.split("");
		System.out.println(Arrays.toString(harf));
		System.out.println(harf.length);
	}

}
