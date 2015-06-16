package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh looping for dengan pencacah maju dan mundur
 */

public class LoopingMenggunakanForDenganPencacah {

	public static void main(String[] args) {
		/**
		 * contoh pencacah maju
		 * int i = 0 adalah deklarasi pencacah
		 * i < 15 adalah kondisi pembatas perulangan
		 * i++ (ekivalen dengan i=i+1) adalah penambahan nilai utk pencacah
		 */
		for (int i = 0; i < 15; i++) {
			System.out.println("nilai i:"+i);
		}
		System.out.println("----------");
		/**
		 * contoh pencacah mundur
		 */
		for (int i = 40; i > 5; i=i-5) {
			System.out.println("nilai i:"+i);
		}
	}
}
