package day33interface;

public interface IcAraba {

		int price=2000;
		boolean old=true;
	
	public default void d��eme() {
	System.out.println("interface de default keyword ile araba d��emesi yapt�k");
	}
	public default void isitma() {
		System.out.println("interface de static keyword ile araba �s�tmas� yapt�k");
	}
	
	
	
	void klima();//interface i�ini yazarken bi�ey demene gerek yok. 
				//body si de yok.�n�ndekileri de yazmasan olur.
	
	public void koltuk();

	public abstract void direksiyon();

	
	
}
