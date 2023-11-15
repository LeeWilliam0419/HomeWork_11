package hw10;

import java.math.BigInteger;

public class Problem1 {
	public static void main(String[] args) {
//		 請設計一隻程式，用亂數產生5個介於1～100之間的整數，
//		而輸出結果可以判斷出這5個整數為是否為質數 (提示：Math類別)
		for(int i = 0; i < 5; i++) {
			Integer random = Integer.valueOf((int)(Math.random() * 100) + 1);
			BigInteger bi = new BigInteger(random.toString());
			System.out.println(bi.isProbablePrime(10) ? random +"是質數" : random + "不是質數");
		}

	}
}
