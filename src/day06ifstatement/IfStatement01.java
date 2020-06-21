package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
	
			if(3>2) {
				System.out.println("if body çalýþtý");
			}
	// bir int variable deðer oluþturun ve ona bir deðer atayýn
	//eðer atadýðýnýz deðer pozitif ise ekrana pozitif yazdýrýn.
	//eðer atadýðýnýz deðer negatif ise ekrana negatif yazdýrýn.
			
	int num1=0;
	if(num1> 0) {
		System.out.println("pozitif");
	}if(num1<0) {
		System.out.println("negatif");
	}if(num1==0) {
			System.out.println("sýfýrdan farklý bir deðer giriniz");
		}	
	}
}
