package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// verilen bir c�mledeki bo�luklar hari� charackter say�s�n� bulunuz.
		
String str="verilen bir c�mledeki bo�luklar hari� charackter say�s�n� bulunuz.";
	str=str.replace(" ",""); //-->bo�luklar� kaybettik
	String kelime[]=str.split("");
//	System.out.println(Arrays.toString(kelime)); //-->yazd�r�r
//	System.out.println(kelime.length); //-->sayar
	
//bo�luk say�s� = kelime say�s� - 1 
//bo�luk say�s� kelime say�s�ndan 1 azd�r.
	
String cumle ="verilen bir c�mledeki bo�luklar hari� charackter say�s�n� bulunuz.";
		String kalaba[]= cumle.split(" "); 
		int bo�lukSay�s� = kalaba.length-1;
		String kalaba2[]= cumle.split(""); 

//	System.out.println(kalaba.length-bo�lukSay�s�);
	System.out.println(kalaba2.length-bo�lukSay�s�);

	}

}
