package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countNum(5);
		countNum(5,7,8,9);
		countNum(5,3,1);

		sumNums(3,7);
		sumNums(3,6,4,2,8,6,3.5,7);
		
		printName("ali","kahraman","can");
		
	}
	public static void countNum(int...a) { 
// �nce burda method olu�tur.
// sonra yukar� ��k ve main methodun i�inden �a��r.
		
		System.out.println(a.length);
		}
	public static void sumNums(double...b) {
		double sum=0;
		for(double w:b) {
			sum=sum+w;
		}
		System.out.println(sum);
	}
	public static void printName(String...n) {
		for(String w : n) {
			System.out.println(w + " ");
		}
}

}

