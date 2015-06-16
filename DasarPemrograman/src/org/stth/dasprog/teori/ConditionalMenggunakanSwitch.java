package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh conditional statements menggunakan switch-case
 */

public class ConditionalMenggunakanSwitch {

	public static void main(String[] args) {
		String namaMahasiswa = "Nona Tegining";
		String mataKuliah = "Dasar Pemrograman";
		char nilai='C';
		String status;
		switch (nilai) {
		case 'A':
			status = "Lulus - Sangat baik";
			break;
		case 'B':
			status = "Lulus - Baik";
			break;
		case 'C':
			status = "Lulus - Cukup";
			break;
		case 'D':
			status = "Lulus - Kurang";
			break;
		default:
			status = "Tidak Lulus";
			break;
		}
		System.out.println(namaMahasiswa+" mendapatkan nilai "+status+
				" pada mata kuliah "+mataKuliah);

	}

}
