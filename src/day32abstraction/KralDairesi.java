package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi m�steri3 = new KralDairesi();
		m�steri3.kahvalti();
		System.out.println("tv �creti= "+ m�steri3.tv("international", 4)+ " dolar");
		System.out.println("wifi �creti= "+ m�steri3.wifi(3)+ " dolar");

	}

	@Override
	public void kahvalti() {
		System.out.println("kahvalt�n�z teras kat kral dairesindedir.");
	}

	public int tv(String international,int saat) {
		if (international.equals("international")) {
			return saat*5;
		}else {
			return 0;
			
		}
	}
	
}
