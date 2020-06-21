package day16overloading;

public class Constructor03 {

	String isim= "Ali Can";
	int yas=33;
	int kilo=85;
	String meslek="automation tester";
	boolean emekli=false;
	
	Constructor03(){
		this.isim=isim;
		this.yas=yas;
		this.kilo=kilo;
		this.meslek=meslek;
		this.emekli=emekli;
		
	}
	

	
	public static void main(String[] args) {
		 
		Constructor03 insan01= new Constructor03();
		System.out.println(insan01.kilo);
		
		
		
	}

}
