package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
	String str1 = "karakartal   ";
	String str2 = "karakartal";

	System.out.println(str1.contains("s"));
		
	System.out.println(str1.trim() + "bu ne");
	System.out.println(str2.trim());
	
	String str3="alican";
	String str4=" ";
	String str5="";

	System.out.println(str3.isEmpty());  //---> false
	System.out.println(str4.isEmpty());  //---> false boşluk ta karakter
	System.out.println(str5.isEmpty());  //---> true karakter yok
	}
}
