package day39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		// Data turlerini casting yaparken uygun olmayan islem yaparsak
		// Java ClassCastException firlatir
		
		// Eger tamamen sayilardan olusmayan bir Stringi int'e cevirmeye
		// Calisirsak Java NumberFormatException firlatir
		int sayi = 10;
		// String str = sayi; // CTE
		
		String str = "123456";
		
		System.out.println(str+10); // 12345610
		
		int strSayi = Integer.parseInt(str);
		System.out.println(strSayi+10); // 123466
		System.err.println(str+20); // 12345620
		
		String str2 ="123a45";
		//System.out.println(Integer.parseInt(str2)); // NumberFormatException
	
		Object sayi2 = 40;
		String sayiStr=(String) sayi2; // Explicit narrowing casting
										// ClassCastException
	}

}
