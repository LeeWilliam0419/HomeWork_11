package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {

		Problem3 pro = new Problem3();
		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sr = new Scanner(System.in);
		int hateNumber = sr.nextInt();
		int sum = pro.selectNum(hateNumber);
		int[][] array = pro.selNumArray(hateNumber, sum);


		System.out.println("可以選擇的數字有：");

		// 產生6個不重複隨機數
		int[] ranArray = new int[6];
		for (int i = 0; i < 6; i++) {

			int random = (int) (Math.random() * sum);
			ranArray[i] = array[random / 6][random % 6];
			while (true) {
				if (Arrays.binarySearch(ranArray, random) > 0) {
					random = (int) (Math.random() * sum);
					ranArray[i] = array[random / 6][random % 6];
				} else
					break;
			}
		}

		// 顯示6個隨機數
		for (int a : ranArray) {
			System.out.print(a + " ");
		}

		sr.close();
	}

	// 做出排除討厭數字後剩下的所有數字的數量
	public int selectNum(int hateNumber) {
		int total = 0;

		for (int i = 1; i < 50; i++) {
			if (i % 10 == hateNumber || i / 10 == hateNumber)
				continue;
			else {
				total++;
			}
		}

		System.out.println();
		System.out.println("總共有：" + total + "個 \n");

		return total;
	}

	//可選擇數字的陣列
	public int[][] selNumArray(int hateNumber, int total) {

		int ans = 1;
		int[][] a = new int[(int) Math.ceil(total / 6.0)][6];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (ans % 10 == hateNumber || ans / 10 == hateNumber) {
					j--;
					ans++;
					continue;
				}
				a[i][j] = ans;
				if (ans >= 50)
					break;
				System.out.print(a[i][j] + "\t");
				ans++;
			}
			System.out.println();

		}

		return a;
	}

}
