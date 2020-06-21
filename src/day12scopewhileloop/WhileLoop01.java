package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// while --> iken demek
		
		int num = 0;
		while(num<4) {
			System.out.println("ali");
			num++;

		}

		//while loop kullanarak 1 den 10 a kadar tamsayıları ekrana yazdırınız
		
		int num2 =1;
			while(num2<11) {
			System.out.print(num2 + " ");
			num2++;
		}
		
		
			
// while loop kullanarak 1 den yirmiye kadar çift tamsayıları ekrana 
// yazdır
			
			int num3 = 1;
			while(num3<21) {
				if(num3 % 2==0) {
					System.out.println(num3 + " ");
				}
				num3++;
			}
			
			
		//5 den 120 ye kadar olan 3 e bölünebilen tamsayılar
			
			int num4=5;
			while(num4<121) {
				if(num4%3==0){
					System.out.print(num4 + " ");
				}
				num4++;
			}
		
	}

}
