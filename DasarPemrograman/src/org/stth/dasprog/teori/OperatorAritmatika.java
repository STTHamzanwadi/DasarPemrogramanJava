package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * operator perkalian, pembagian, dan modulus
 */

public class OperatorAritmatika {
	public static void main(String[] args) {
		//operasi aritmatika bilangan integer
		int bil1,bil2,bil3,bil4,bil5;
		bil1 = 5;
		bil2 = 3;
		bil3 = bil1 * bil2;//tanda * adalah operator perkalian
		bil4 = bil1 / bil2;//tanda / adalah operator pembagian/divider
		bil5 = bil1 % bil2;//tanda % adalah operator modulus (sisa pembagian)
		System.out.println("hasil perkalian bil1 dan bil2 adalah:"+bil3);
		System.out.println("hasil pembagian bil1 dan bil2 adalah:"+bil4);
		System.out.println("sisa pembagian bil1 dan bil2 adalah:"+bil5);
		bil1++; //ekivalen dgn bil1=bil1+1
		System.out.println("bil 1 setelah ditambahkan 1  menjadi:"+bil1);
		System.out.println();
		//operasi aritmatika bilangan pecahan
		double d1,d2,d3,d4,d5;
		d1 = 5.0;
		d2 = 3.0;
		d3 = d1 * d2;
		d4 = d1 / d2;
		d5 = d1 % d2;
		System.out.println("hasil perkalian bil1 dan bil2 adalah:"+d3);
		System.out.println("hasil pembagian bil1 dan bil2 adalah:"+d4);
		System.out.println("sisa pembagian bil1 dan bil2 adalah:"+d5);
	}

}
