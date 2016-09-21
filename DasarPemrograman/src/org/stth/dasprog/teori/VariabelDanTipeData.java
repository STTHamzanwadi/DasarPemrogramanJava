package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Cara mendeklarasikan variabel dengan tipe data tertentu
 */

public class VariabelDanTipeData {
	
	public static void main(String[] args) {
		
		//cara mendeklarasikan variabel
		int i;//deklarasi variabel bernama i dengan tipe data int (integer : 1,2,3,4,5,6....)
		String s;//deklarasi variabel bernama s dengan tipe data String (teks)
		char c;//deklarasi variabel bernama c dengan tipe data char (karakter, satu huruf)
		boolean b;//deklarasi variabel bernama b dengan tipe data boolean (true/false)
		double d;//deklarasi variabel bernama d dengan tipe data double 
		
		//cara memberikan nilai pada variabel (assignment)
		i = 10; //variabel i diisi dengan nilai 10
		s = "Ini adalah nilai variabel 2"; //variabel String dapat diisi dengan teks yang diapit tanda " " (kutip 2)
		c = 'A'; //variabel char dapat diisi SATU karakter yang diapit tanda ' ' (kutip 1)
		b = true; //variabel boolean dapat diisi nilai true atau false
		d = 3.435; //variabel double dapat diisi nilai pecahan/desimal
		
		//tampilkan nilai variabel-variabel di atas
		System.out.println("nilai i adalah:"+i);
		System.out.println("nilai s adalah:"+s);
		System.out.println("nilai c adalah:"+c);
		System.out.println("nilai b adalah:"+b);
		System.out.println("nilai d adalah:"+d);
		
	}

}
