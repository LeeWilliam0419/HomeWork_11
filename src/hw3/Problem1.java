package hw3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
	public static void main(String[] args) {
		// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
		// 三角形、直角三角形、其它三角形或不是三角形
		System.out.println("請輸入三個整數：");

		Scanner inputTri = new Scanner(System.in);
		int[] tri = { inputTri.nextInt(), inputTri.nextInt(), inputTri.nextInt() };
		Arrays.sort(tri);
		Problem1 count = new Problem1();

		// 先判斷是否為三角形
		if ((tri[0] + tri[1] > tri[2]) && tri[0] > 0 && tri[1] > 0 && tri[2] > 0) {

			// 以三角形邊長相同的數量判斷是否為正三角形、等腰三角形、其他三角形
			switch (count.uniqueArrCount2(tri)) {
			case 1:
				System.out.print("正三角形");
				break;
			case 2:
				if (Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
					System.out.print("等腰直角三角形");
				} else {
					System.out.print("等腰三角形");
				}
				break;
			default:
				// 以兩邊平方和是否等於長邊平方判斷是否為直角三角形
				if (Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
					System.out.print("直角三角形");
				} else {
					System.out.print("其他三角形");
				}
			}
		} else {
			System.out.print("不是三角形");
		}

		inputTri.close();
	}

	// 獲得邊長不重複的元素數量
	public int uniqueArrCount2(int[] sideLength) {

		Set<Integer> tri = new HashSet<>();
		for(int i = 0; i < sideLength.length; i++) tri.add(sideLength[i]);
		return tri.size();
//		if (sideLength[0] == sideLength[1] && sideLength[0] == sideLength[2]) {
//			return 1;
//		} else if (sideLength[0] == sideLength[1] || sideLength[0] == sideLength[2] || sideLength[2] == sideLength[1])
//			return 2;
//		else
//			return 3;
	}

}
