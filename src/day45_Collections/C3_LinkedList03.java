package day45_Collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>(); 

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		
		System.out.println(ll1.remove(0)); // A > remove(index) indexteki elemani siler ve 
										   // sildigi elemani bize dondurur
		// Eger listemiz integer'lardan olusuyorsa 
		// Parantez icine yazdigimiz sayinin index mi yoksa sayi mi (obje mi) oldugunu karistirmamak icin 
		// Java parantez icine yazilani index olarak kabul eder.
		
		System.out.println(ll1); // [B]
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [B, A, B]
		
		System.out.println(ll1.remove("B")); // true veya false dondurur
		System.out.println(ll1); // [A, B] > ilk B yi sildi
		
		ll1.addFirst("B");
		System.out.println(ll1); // [B, A, B]
		
		System.out.println(ll1.removeFirstOccurrence("C")); // true veya false dondurur
		ll1.removeFirstOccurrence("B");
		System.out.println(ll1); // [A, B]
		
		System.out.println(ll1.remove()); // A sildigi elemani dondurur
		System.out.println(ll1); // [B]
		

	}

}
