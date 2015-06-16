package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh method rekursif (method memanggil dirinya sendiri)
 */

public class MethodRekursif {
	static int faktorial(int n){
		if (n==0) {
			return 1;
		} else {
			return n*faktorial(n-1); //titik rekursif
		}
	}
	static int fibonacci(int n){
		if (n<=1) {
			return 1;
		} else {
			return fibonacci(n-1)+fibonacci(n-2); //titik rekursif
		}
	}
	
	public static void main(String[] args) {
		//menghitung fibonacci 0-9
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci(i));
		}
		System.out.println("---------------");
		//menghitung faktorial 0-9
		for (int i = 0; i < 10; i++) {
			System.out.println(faktorial(i));
		}
	}

}
