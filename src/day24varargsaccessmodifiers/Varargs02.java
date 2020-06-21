package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		valueChar("Character = ",'a','b','c');
//		valueChar("Character = ",'a','b');
//			product(1,2,3,4,5);
}
	public static void valueChar(String s,char...c) {
		for(char w: c) {
			System.out.print(s);
			System.out.println(w);
		}
	}
	public static void product(int x, int...y ) {
		int product =1;
		for(int w : y) {
			product=product*w;
			}
		System.out.println(x * product);
		System.out.println(x);

		}
	}
	