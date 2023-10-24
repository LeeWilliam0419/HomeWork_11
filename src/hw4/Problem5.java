package hw4;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
//		 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		Problem5 pr = new Problem5();
		
		Scanner sc = new Scanner(System.in);
		
		//判斷輸入是否符合日期規定
		while(true) {
			System.out.print("輸入三個整數西元年、月、日：");
			int[] date = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			
			if(date[1] < 0 || date[1] > 12 || date[0] < 0 || date[2] < 0 || date[2] > 31) {
				System.out.println("日期輸入錯誤，請重新輸入！");
			}else if (date[2] > 30 && !(date[1] % 7 == 0 || (date[1] % 7) % 2 == 1)) {
				System.out.println("小月只有到30號，請重新輸入！");
			}else if ((date[0] % 4 != 0 || date[0] % 400 != 0) && date[2] > 28) {
				System.out.println("平年2月只有到28號，請重新輸入！");
			}else if (!(date[0] % 4 != 0 || date[0] % 400 != 0) && date[2] > 29) {
				System.out.println("潤年2月只有到29號，請重新輸入！");
			}else {
				int days = pr.dateCalculate(date);
				System.out.print("輸入的日期為該年第" + days + "天");				
			}
				break;
			
		}

		
		
		
		sc.close();
	}
	
	//日期運算
	public int dateCalculate(int[] date) {
		int days = (date[1] - 1) * 30 + date[2];
		
		
		for(int i = 1; i <= date[1] - 1; i++) {
			days = (i % 7 == 0 || (i % 7) % 2 == 1) ? days + 1 : days;
		}

		if(date[1] > 2) {
			days = (date[0] % 4 != 0 || date[0] % 400 != 0) ? days - 2 : days - 1;
			return days;			
		}else
			return days;
	}
}
