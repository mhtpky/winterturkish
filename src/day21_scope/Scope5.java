package day21_scope;

public class Scope5 {

	public static void main(String[] args) {
	
		for(int i=0 ; i<5 ; i++) {
			String isim = " Ayse";
			System.out.println(i + " " + isim);
		}
		// System.out.println(isim);  >> loop icinde olusturulan variable'lar loop'a ozeldir ve
									  // loop disinda kullanilamaz

		
		for (int i=0 ; i<5 ; i++) {
			System.out.print(i+ " ");
		}
		// System.out.println(i); >>
		
		System.out.println();
		int count=0;// method'a ait local variable'dir
					// deger atamadan kullanmaya calisirsanir CTE alirsiniz
		
		while(count<5) {
			System.out.println(count);
			count++;
		}
		
		
	}

}
