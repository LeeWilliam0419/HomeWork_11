package hw10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
//		 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，
//		 可以轉成想要的輸出格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一
//		 ，而輸入非指定日期數字格式會顯示出提示訊息如圖

		String userDate, choose;
		String dateRule = "^\\d{8}$";
		String chooseRule = "^[1-3]$";
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		do {
			System.out.print("請輸入日期(年月日，例如:20110131)：");
			userDate = sc.next();
			year = Integer.parseInt(userDate.substring(0, 4));
			month = Integer.parseInt(userDate.substring(4, 6));
			day = Integer.parseInt(userDate.substring(6));
		} while (!matchNum(userDate, dateRule) || !matchDate(year, month, day));

		Calendar date = new GregorianCalendar(year, month - 1, day);

		do {
			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年：");
			choose = sc.next();
		} while (!matchNum(choose, chooseRule));

		switch (Integer.parseInt(choose)) {
		case 1:
			System.out.printf("年/月/日：%tY/%<tm/%<td", date);
			break;
		case 2:
			System.out.printf("月/日/年：%tm/%<td/%<tY", date);
			break;
		case 3:
			System.out.printf("日/月/年：%td/%<tm/%<tY", date);
			break;
		}
		sc.close();
	}

	public static boolean matchNum(String num, String regex) {
		if (num.matches(regex))
			return true;
		else {
			System.out.println("日期格式不正確，請再輸入一次！");
			return false;
		}
	}

	public static boolean matchDate(int year, int month, int day) {
		GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
		if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("日期輸入錯誤，請重新輸入！");
		} else if (gc.isLeapYear(year) && month == 2 && day > 29) {
			System.out.println("潤年2月只有到29號，請重新輸入！");
		} else if (!gc.isLeapYear(year) && month == 2 && day > 28) {
			System.out.println("平年2月只有到28號，請重新輸入！");
		} else if (day > 30 && !(month % 7 == 0 || (month % 7) % 2 == 1)) {
			System.out.println("小月只有到30號，請重新輸入！");
		} else {
			return true;
		}
		return false;
	}
}
