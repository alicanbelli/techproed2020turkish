package day26encapsulation;

public class Encapsulation02 {
	private char ilkHarf='S'; //instance variable lar.
	private double para=23.75;
	private boolean isEmekli=false;
	
	public static void main(String[] args) {
//Variable'a atanan degerin degistirilmesini istemiyorsaniz o variable ile 
//alakali setter() olusturmamalisiniz
		
//Variable'a atanan degerin okunmasini istemiyorsaniz, o variable ile alakali
//getter() olusturmamalisiniz.
		
//Sadece getter() kullanir ve hic setter() kullanmazsaniz, variable degerleri 
//degistirilemez demektir. Bu tarz class'lara "Immutable Class" denir.
		
//Sadece setter() kullanir ve hic getter() kullanmazsaniz, variable degerleri 
//okunamaz demektir.

		
		
		
		Encapsulation01 obj=new Encapsulation01();
		System.out.println(obj.getKimlikNo());
		obj.setKimlikNo("15000000");
		System.out.println(obj.getKimlikNo());
	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return isEmekli;
	}

	public void setEmekli(boolean isEmekli) {
		this.isEmekli = isEmekli;
	}

}
