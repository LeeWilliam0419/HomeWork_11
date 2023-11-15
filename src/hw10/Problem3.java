package hw10;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
//		 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，
//		 可以轉成想要的輸出格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一
//		 ，而輸入非指定日期數字格式會顯示出提示訊息如圖

		String userDate, choose, showDate;
		String dateRule = "^\\d{8}$";
		String chooseRule = "^[1-3]$";
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		
		//日期輸入和判斷
		do {
			System.out.print("請輸入日期(年月日，例如:20110131)：");
			userDate = sc.next();
			year = Integer.parseInt(userDate.substring(0, 4));
			month = Integer.parseInt(userDate.substring(4, 6));
			day = Integer.parseInt(userDate.substring(6));
		} while (!matchNum(userDate, dateRule) || ((showDate = matchDate(year, month, day, "yyyy/MM/dd")) == null));
		
		//選擇欲格式化選項
		do {
			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年：");
			choose = sc.next();
		} while (!matchNum(choose, chooseRule));
		
		//顯示選擇結果
		switch (Integer.parseInt(choose)) {
		case 1:
			System.out.println(showDate);
			break;
		case 2:
			System.out.println(matchDate(year, month, day, "MM/dd/yyyy"));
			break;
		case 3:
			System.out.println(matchDate(year, month, day, "dd/MM/yyyy"));
			break;
			
		}
		sc.close();
	}

	//使用者輸入長度判斷
	public static boolean matchNum(String num, String regex) {
		if (num.matches(regex))
			return true;
		else {
			System.out.println("日期格式不正確，請再輸入一次！");
			return false;
		}
	}

	//判斷日期是否符合
	public static String matchDate(int year, int month, int day, String format) {
		try {
			String date = LocalDate.of(year, month, day)
							.format(DateTimeFormatter.ofPattern(format));
			return date;
			
		}catch(DateTimeException e) {
			System.out.println("日期格式不正確，請再輸入一次！");
			return null;
		}
	}
	
}
