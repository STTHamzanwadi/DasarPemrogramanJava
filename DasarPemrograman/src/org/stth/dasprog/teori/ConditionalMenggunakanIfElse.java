package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Contoh conditional statement menggunakan if-else
 */

public class ConditionalMenggunakanIfElse {

	public static void main(String[] args) {
		String namaMahasiswa = "Nona Tegining";
		double ipk=3.27;
		
		if (ipk>=3.5) {
			System.out.println(namaMahasiswa+" lulus dengan predikat cum laude");
		} else if (ipk>=3.0) {
			System.out.println(namaMahasiswa+" lulus dengan predikat sangat memuaskan");
		} else if (ipk>=2.75) {
			System.out.println(namaMahasiswa+" lulus dengan predikat memuaskan");
		} else {
			System.out.println(namaMahasiswa+" lulus aja dah");
		}
	}

}
