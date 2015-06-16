package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Operator AND, OR dan NOT
 */

public class OperatorLogika {
	public static void main(String[] args) {
		int i=3;
		int j=5;
		int k=7;
		boolean b1 = k>i;
		boolean b2 = i>j;
		boolean b3 = b1 && b2;//operator logika AND
		boolean b4 = b1 || b2;//operator logika OR
		boolean b5 = !b2;//operator logika NOT
		System.out.println("b1 bernilai:"+b1);
		System.out.println("b2 bernilai:"+b2);
		System.out.println("b1 AND b2 bernilai:"+b3);
		System.out.println("b1 OR b2 bernilai:"+b4);
		System.out.println("NOT b2 bernilai:"+b5);
	}

}
