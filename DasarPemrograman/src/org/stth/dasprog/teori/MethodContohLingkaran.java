package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh method untuk menghitung keliling dan luas lingkaran
 */

public class MethodContohLingkaran {
	static double luasLingkaran(double jarijari){
		double luas;
		double phi = 3.14;
		luas = phi*jarijari*jarijari;
		return luas;
	}
	static double kelilingLingkaran(double jarijari){
		double keliling;
		double phi = 3.14;
		keliling = 2 * phi * jarijari;
		return keliling;
	}
	public static void main(String[] args) {
		double rA = 3.0;//jari-jari sebuah lingkaran A
		System.out.println("Luas lingkaran A:"+luasLingkaran(rA));
		System.out.println("Keliling lingkaran A:"+kelilingLingkaran(rA));
	}

}
