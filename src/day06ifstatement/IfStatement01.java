package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
	
			if(3>2) {
				System.out.println("if body �al��t�");
			}
	// bir int variable de�er olu�turun ve ona bir de�er atay�n
	//e�er atad���n�z de�er pozitif ise ekrana pozitif yazd�r�n.
	//e�er atad���n�z de�er negatif ise ekrana negatif yazd�r�n.
			
	int num1=0;
	if(num1> 0) {
		System.out.println("pozitif");
	}if(num1<0) {
		System.out.println("negatif");
	}if(num1==0) {
			System.out.println("s�f�rdan farkl� bir de�er giriniz");
		}	
	}
}
