package hw4;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」

		int[][] emp = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int sum = 0;

		System.out.print("輸入輸入欲借的金額：");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();

		System.out.print("\n有錢可借的員工編號：");

		for (int i = 0; i < emp.length; i++) {
			if (emp[i][1] >= money) {
				System.out.print(emp[i][0] + " ");
				sum++;
			}

		}
		System.out.print("共 " + sum + " 人！");
		input.close();
	}
}
