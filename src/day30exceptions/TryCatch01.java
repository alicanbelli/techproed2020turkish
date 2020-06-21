package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		 int num1 = 12;
		 int num2 = 2;
		 
		 try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("sayýlarý sýfýra bölme");
		}catch (Exception e) {
			System.out.println("hata yapma");
		}finally {
			System.out.println("aferin sana");
		}

	}

}
