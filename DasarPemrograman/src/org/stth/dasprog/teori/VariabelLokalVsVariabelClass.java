package org.stth.dasprog.teori;
/**
@author stthamzanwadi
lisensi : cc by sa
membedakan scope/ruang lingkup variabel
variabel class dapat diakses dari seluruh tempat pada class bersangkutan
variabel lokal hanya dapat diakses pada method yang mendeklarasikannya
 **/
public class VariabelLokalVsVariabelClass {
	static int i=1000;//cth deklarasi variabel class
	public static void main(String[] args) {
		System.out.println(i);
		int i = 20;//cth deklarasi variabel lokal
		System.out.println(i);
		int x = i + i;
		int y = i + VariabelLokalVsVariabelClass.i;
		System.out.println(x+y);
	}

}
