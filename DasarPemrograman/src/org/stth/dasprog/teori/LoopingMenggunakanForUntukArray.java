package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh looping for untuk array
 */

public class LoopingMenggunakanForUntukArray {

	public static void main(String[] args) {
		String[] namaHewan ={"Kucing","Anjing","Tupai","Gajah","Harimau"};
		
		for (int i = 0; i < namaHewan.length; i++) {
			System.out.println(namaHewan[i]);
		}
	}
}
