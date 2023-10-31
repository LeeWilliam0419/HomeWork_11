package hw5;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
//		 請設計一個方法為starSquare(int width, int height)，
//		 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入寬與高：");
		starSquare(sc.nextInt(), sc.nextInt());

		sc.close();
	}

	public static void starSquare(int width, int height) {
		String a = "*";
		for (int i = 0; i < height; i++) {
			System.out.println(a.repeat(width));
		}
	}
}
