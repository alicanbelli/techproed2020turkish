package day17constructors;


public class Constructors05 {

	public static void main(String[] args) {
		
 Constructors04 obj1 = new Constructors04(); //--> cons04 ten bir obje yapt�k
	System.out.println(obj1.num1);  //---> num1 in alt�n� sar� �izmedi.
									//--->��nk� statik de�il.
	
System.out.println(obj1.num2); //---> num2 in alt�n� sar� �izdi.
							//--->��nk� statik ve obj kullanarak �a��rma diyor.
System.out.println(Constructors04.num2); 
	//--> static olan num2 yi �a��rman�n do�ru yolu bu.
	//-->alt�n� �izmedi. ��nk� o class tan class ismi ile �a��rd�m. 
	
	
	}

}
