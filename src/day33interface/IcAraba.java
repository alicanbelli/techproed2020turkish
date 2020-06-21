package day33interface;

public interface IcAraba {

		int price=2000;
		boolean old=true;
	
	public default void döþeme() {
	System.out.println("interface de default keyword ile araba döþemesi yaptýk");
	}
	public default void isitma() {
		System.out.println("interface de static keyword ile araba ýsýtmasý yaptýk");
	}
	
	
	
	void klima();//interface içini yazarken biþey demene gerek yok. 
				//body si de yok.önündekileri de yazmasan olur.
	
	public void koltuk();

	public abstract void direksiyon();

	
	
}
