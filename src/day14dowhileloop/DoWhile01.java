package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1; 
		do {
			System.out.println(num);
			num++;
		}while(num<-6);
		
		//10 ile 20 arasýndaki tek tam sayýlarý ekrana yazdýrýn
		
		// yol 1	
	
		int num2= 11;
		do {
			if(num2%2==1) {
			System.out.println(num2);
			}num2++;
		}while(num2<20);
		
		
		
		
	// yol 2	
		int num3 = 11;
		do {
			System.out.print(num3);
			num3= num3 +2;
			
		}while(num3<20);
		
		
	}

}
