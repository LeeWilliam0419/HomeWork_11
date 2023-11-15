package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
//		 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//		 (2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API
//		 文件, 判斷數字可用正規表示法)
		Scanner sc = new Scanner(System.in);
		String userNum, choose;
		String rule = "^[0-9]+.*\\d*$";
		String chooseRule = "^[1-3]$";

		do {
			System.out.print("請輸入數字：");
			userNum = sc.next();
		} while (!matchNum(userNum, rule));

		do {
			System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號：");
			choose = sc.next();
		} while (!matchNum(choose, chooseRule));

		double user = Double.parseDouble(userNum);

		switch (Integer.valueOf(choose)) {
		case 1:
			Format fm1 = new DecimalFormat("#,###.##");
			System.out.println("千分位數字：" + fm1.format(user));
			break;
		case 2:
			Format fm2 = new DecimalFormat("0%");
			System.out.println("百分比數字：" + fm2.format(user));
			break;
		case 3:
			Format fm3 = new DecimalFormat("0.####E00");
			System.out.println("科學記號數字：" + fm3.format(user));
		}

		sc.close();
	}

	// 判斷是否符合格式
	public static boolean matchNum(String num, String regex) {
		if (num.matches(regex))
			return true;
		else {
			System.out.println("數字格式不正確，請再輸入一次！");
			return false;
		}
	}
}
