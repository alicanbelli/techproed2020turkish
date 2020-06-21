package day32abstraction;

public class TekKisilikoda extends Otel{

	public static void main(String[] args) {
		TekKisilikoda müsteri1=new TekKisilikoda();
		müsteri1.kahvalti();
		System.out.println("tv izleme süresi= " +müsteri1.tv(5) + " dolar");
		System.out.println("wifi süresi= " +müsteri1.wifi(1) + " dolar");
	}

	@Override
	public void kahvalti() {
		 System.out.println("kahvaltýnýz sandvich'tir.");
	}
	
	public int tv(int saat) {
		return saat*2;
	
		 
	}

}
