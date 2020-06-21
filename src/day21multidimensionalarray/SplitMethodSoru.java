package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// verilen bir cümledeki boþluklar hariç charackter sayýsýný bulunuz.
		
String str="verilen bir cümledeki boþluklar hariç charackter sayýsýný bulunuz.";
	str=str.replace(" ",""); //-->boþluklarý kaybettik
	String kelime[]=str.split("");
//	System.out.println(Arrays.toString(kelime)); //-->yazdýrýr
//	System.out.println(kelime.length); //-->sayar
	
//boþluk sayýsý = kelime sayýsý - 1 
//boþluk sayýsý kelime sayýsýndan 1 azdýr.
	
String cumle ="verilen bir cümledeki boþluklar hariç charackter sayýsýný bulunuz.";
		String kalaba[]= cumle.split(" "); 
		int boþlukSayýsý = kalaba.length-1;
		String kalaba2[]= cumle.split(""); 

//	System.out.println(kalaba.length-boþlukSayýsý);
	System.out.println(kalaba2.length-boþlukSayýsý);

	}

}
