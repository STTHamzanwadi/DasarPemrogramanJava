package org.stth.dasprog.teori;
/**
 * @author stthamzanwadi
 * lisensi : cc-by-sa
 * Operator sama dengan, tidak sama dengan,
 * lebih kecil, lebih besar , dst
 */

public class OperatorRelasional {
	public static void main(String[] args) {
		int i,j,k;
		i = 10; 
		j = 10; 
		k = 11;
		System.out.println("nilai i:"+ i);
		System.out.println("nilai j:"+ j);
		System.out.println("nilai k:"+ k);
		System.out.println("i sama dengan j bernilai:"+ (i == j)); //operator relasional ==(sama dengan)
		System.out.println("i tidak sama dengan j bernilai:"+ (i != j)); //operator relasional !=(tidak sama dengan)
		System.out.println("j lebih besar dari k bernilai:"+ (j > k)); //operator relasional > (lebih besar)
		System.out.println("j lebih kecil dari k bernilai:"+ (j < k)); //operator relasional < (lebih kecil)
		System.out.println("j lebih kecil dari k bernilai:"+ (j <= k)); //operator relasional <= (lebih kecil sama dengan)
	}

}

