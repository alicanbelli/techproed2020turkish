package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		
		String str1 = "Ali";
		String str2 = "Veli";
		
	System.out.println(str1.concat(str2).concat(" ").concat(str1));
		
		String str3 = "ata";
	System.out.println(str3.replace("a", "�"));
	System.out.println(str3.replace("", "y")); //--> hi�bi�ey koyarsan de�i�tirir.
	System.out.println(str3.replace("t", "")); //--> harf silmek i�in kullan�l�r
	System.out.println(str3.replace("a", "")); //--> harf silmek i�in kullan�l�r
	System.out.println(str3.replace("at", "mustaf")); 
	
	
	
	
	String str4 = "Karakartal";
	
	System.out.println(str4.replaceFirst("Kara", "AK"));


	}

}
