package hw3;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		int ans = (int)(Math.random() * 101);
		System.out.println("開始猜數字吧！");
		
		Problem2 guessNumber = new Problem2();
		Scanner sr = new Scanner(System.in);
		while(true) {
			if(guessNumber.compareNumber(sr.nextInt(), ans))
				break;
		}
		
		sr.close();
	}
	
	//判斷猜數字與正確答案是否相同
	public boolean compareNumber(int userNum, int ans) {
		if(userNum > ans) {
			System.out.println("猜錯囉，你的答案大於正確答案");
			return false;
		}
		else if(userNum < ans) {
			System.out.println("猜錯囉，你的答案小於正確答案");
			return false;
		}
		else {
			System.out.println("答對了！，答案就是" + ans);
			return true;
		}
	}

}
