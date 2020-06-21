package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		
		
		String str1="Javva World";
		
		
		
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('a'));      //-->1
		System.out.println(str1.lastIndexOf('a'));  //-->3
		
		System.out.println(str1.substring(4,5)); //C
		
System.out.println(str1.indexOf('a',2) + "bu ne");  
//--> ekrandaki 2. a karakterinin yerini bul.
										//-->bu da 4 tür.

System.out.println(str1.indexOf('a',4));  	// aramaya 4 ten baþlar ve sýrasýný 
											//baþtan alýr.
	
System.out.println(str1.indexOf('a',5));  // 5'inci karakterden baþlar sonra arar.
										// bulamayacaðý için -1 der.	

//Alamanya Stringindeki ikinci a karakterinin indexini bulunuz
		
String str11="Alamanya";
System.out.println(str11.indexOf('a',3));

String str12 = "Missisippi";
System.out.println(str12.indexOf("si"));




	}

}
