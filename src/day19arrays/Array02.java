package day19arrays;

public class Array02 {

	public static void main(String[] args) {
// 4 elemanli char bir array olusturun, bu array'e elemanlar yerlestirin.
// Tum elemanlari for dongusu kullanarak ekrana yazdirin.
// Sadece son elemani ekrana yazdirin.

		char arr1[]=new char[4];
			
		arr1[0]='A';
		arr1[1]='B';
		arr1[2]='C';
		arr1[3]='D';
		
		
//Array'in length'ini bulmak icin "ArrayIsmi.length" yazmak yeterlidir
//Stringlerde de length methodu kullanilir ama 
//String'lerde kullanilan length 
//methodu parantezlidir. 
//Yani; String'lerde ==> length() Arrya'lerde ==> length
//System.out.println(arr1.length);//4
				
//Array'deki son elemani yazdirmak icin length kullaniniz
		
		
		for(int i=0; i<4;i++) {
			System.out.print(arr1[i] + " ");
//		
		}
		System.out.println(arr1[3]);	

		System.out.println(arr1.length); //-->array uzunluðunu bulma
		System.out.println(arr1[arr1.length-1]); //-->son indexi yazdýrma
	}

}
