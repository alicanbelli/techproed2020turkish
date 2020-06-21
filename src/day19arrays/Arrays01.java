package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// integer array
		int arr1[]=new int[5];
		char arr2[]= new char[5];
System.out.println(arr1[2]); //---> 2. indexteki deðeri verir.
System.out.println(arr2[1]);

//	arr1[4]=12; //---> 4 indexteki array e 12 deðeri atandý.
	arr1[0]=11;
	System.out.println(arr1[0]);
	arr1[1]=22;
	System.out.println(arr1[1]);
	arr1[2]=33;
	System.out.println(arr1[2]);
	arr1[3]=44;
	System.out.println(arr1[3]);
	arr1[4]=55;
	System.out.println(arr1[4]);
	
	
// array deki elemnlarý for döngüsü kullanarak yazdýr
	for(int i=0;i<5;i++) {
		System.out.print(arr1[i]);
		
		//arrayde olmayan index e deðer atamasý
		
		arr1[4]=23;
	//System.out.println(arr1[5]); //--> 5 index yok. o yüzden hata verir
	}
	
	}

}
