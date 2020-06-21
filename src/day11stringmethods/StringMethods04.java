package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {

		String paraErkek = "3000";
		String paraKadin= "2500";
		
		System.out.println(paraErkek + paraKadin); //--->30002500
		
		System.out.println(Integer.valueOf(paraKadin)+Integer.valueOf(paraErkek));
	
		
	int maasErkek = 1900;
	int maasKadýn = 2000;
	
	System.out.println(maasErkek + maasKadýn); //--> 3900;
	
	System.out.println(String.valueOf(maasKadýn) + String.valueOf(maasErkek));
												//--> 20001900
	
	
	
	}
	

}
