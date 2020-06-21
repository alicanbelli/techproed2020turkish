package day17constructors;


public class Constructors05 {

	public static void main(String[] args) {
		
 Constructors04 obj1 = new Constructors04(); //--> cons04 ten bir obje yaptýk
	System.out.println(obj1.num1);  //---> num1 in altýný sarý çizmedi.
									//--->çünkü statik deðil.
	
System.out.println(obj1.num2); //---> num2 in altýný sarý çizdi.
							//--->çünkü statik ve obj kullanarak çaðýrma diyor.
System.out.println(Constructors04.num2); 
	//--> static olan num2 yi çaðýrmanýn doðru yolu bu.
	//-->altýný çizmedi. çünkü o class tan class ismi ile çaðýrdým. 
	
	
	}

}
