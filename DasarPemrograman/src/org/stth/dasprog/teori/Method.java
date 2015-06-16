package org.stth.dasprog.teori;
/**
 * 
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh method dengan return value dan method tanpa return value (void)
 */


public class Method {
	
	//contoh method A dengan keluaran tipe string
	static String jenisBodi(double bb,double tb){
		String s;
		double idx = 10000 * bb / (tb*tb);
		if (idx >=30) {
			s = "obesitas";
		} else if (idx>=25) {
			s = "gemuk";
		} else if (idx>=23) {
			s = "agak berisi";
		} else if (idx>=18.5) {
			s = "normal";
		} else {
			s = "kurus";
		}
		return s;
	}

	//contoh method B tanpa keluaran (void)
	static void jenisBodiB(String nama, double bb,double tb){
		String s;
		double idx = 10000 * bb / (tb*tb);
		if (idx >=30) {
			s = "obesitas";
		} else if (idx>=25) {
			s = "gemuk";
		} else if (idx>=23) {
			s = "agak berisi";
		} else if (idx>=18.5) {
			s = "normal";
		} else {
			s = "kurus";
		}
		System.out.println(nama+" memiliki bodi "+s);
	}


	public static void main(String[] args) {
		// Contoh penggunaan method A
		String namaSoleh = "Soleh";
		double beratBadanSoleh = 80;
		double tinggiBadanSoleh = 170;
		String bodi= jenisBodi(beratBadanSoleh, tinggiBadanSoleh);
		System.out.println(namaSoleh+" memiliki bodi "+bodi);

		// Contoh penggunaan method B
		String namaJoni = "Joni";
		double beratBadanJoni = 80;
		double tinggiBadanJoni = 190;
		jenisBodiB(namaJoni, beratBadanJoni, tinggiBadanJoni);
	}



}
