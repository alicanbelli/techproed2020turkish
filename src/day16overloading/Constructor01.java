package day16overloading;

public class Constructor01 {
		int price = 20000;
//	    Data Type	 isim
		int year= 2020;
		String make="Honda";
		String type="civic";
	
		public static void main(String[] args) {
			//bir tane obje üretildi
		Constructor01 hondaAraba=new Constructor01(); 
		
//	        
//		   Data		  isim    obje    Constructor
//		   type				 üretmeye
						     //yarar
	
//	constructor01 tipinde 
//	honda araba isminde 
//	yeni obje üret
	
		System.out.println(hondaAraba.price);//20000
		System.out.println(hondaAraba.year); //2020
		System.out.println(hondaAraba.type);
		System.out.println(hondaAraba.make);
	}

}
