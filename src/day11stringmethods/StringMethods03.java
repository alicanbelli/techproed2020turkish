package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		
		String str1 = "Ali";
		String str2 = "Veli";
		
	System.out.println(str1.concat(str2).concat(" ").concat(str1));
		
		String str3 = "ata";
	System.out.println(str3.replace("a", "ü"));
	System.out.println(str3.replace("", "y")); //--> hiçbiþey koyarsan deðiþtirir.
	System.out.println(str3.replace("t", "")); //--> harf silmek için kullanýlýr
	System.out.println(str3.replace("a", "")); //--> harf silmek için kullanýlýr
	System.out.println(str3.replace("at", "mustaf")); 
	
	
	
	
	String str4 = "Karakartal";
	
	System.out.println(str4.replaceFirst("Kara", "AK"));


	}

}
