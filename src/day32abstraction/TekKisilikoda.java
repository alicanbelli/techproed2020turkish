package day32abstraction;

public class TekKisilikoda extends Otel{

	public static void main(String[] args) {
		TekKisilikoda m�steri1=new TekKisilikoda();
		m�steri1.kahvalti();
		System.out.println("tv izleme s�resi= " +m�steri1.tv(5) + " dolar");
		System.out.println("wifi s�resi= " +m�steri1.wifi(1) + " dolar");
	}

	@Override
	public void kahvalti() {
		 System.out.println("kahvalt�n�z sandvich'tir.");
	}
	
	public int tv(int saat) {
		return saat*2;
	
		 
	}

}
