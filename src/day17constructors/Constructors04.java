package day17constructors;

public class Constructors04 {
	
	int num1=12;
	static int num2=22;
	
	public static void main(String[] args) {
		num2++;//--> num2 static olduðu için main method içinde kullanýlýr.
	//num1++; //--> num1 static olmadýðý için main method içinde kullanýlamaz
	//static methodlarýn içinde sadece static elemanlar kullanýlabilir.
	System.out.println(num2);
	
	}

}
