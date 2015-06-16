package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh conditional statement menggunakan if
 */

public class ConditionalMenggunakanIf {

	public static void main(String[] args) {
		String namaHewan = "Ikan Betok";
		boolean berkaki = false;
		boolean bersayap = false;
		boolean bersirip = true;
		
		if (berkaki){
			System.out.println(namaHewan+" dapat bergerak dengan berjalan/berlari");
		}
		
		if (bersayap){
			System.out.println(namaHewan+" dapat bergerak dengan terbang");
		}
		
		if (bersirip){
			System.out.println(namaHewan+" dapat bergerak dengan berenang");
		}
	}

}
