package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3 �n �arp�m tablosu ekrana yazd�ran program
System.out.println("for loop ile ��z�m");
			for(int i =1; i<11; i++) {
				System.out.println("3x"+i + '=' +3*i);
			}
System.out.println("while loop ile ��z�m");
		int num = 1;
		while(num<11) {
			System.out.println("3x"+num + '=' +3*num);
			num++;
		}
		
	}

}
