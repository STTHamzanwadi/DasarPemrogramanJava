package org.stth.dasprog.teori;

public class LoopingMenggunakanDoWhile {

	public static void main(String[] args) {
		int x=30;
		/** 
		 * looping do-while menyebabkan proses diulang minimal satu kali,
		 * terlepas dari kondisi yang diberikan
		 */
		do  {
			System.out.println("nilai x : " + x );
			x=x+3;
		}
		while ( x < 10 );
	}
}
