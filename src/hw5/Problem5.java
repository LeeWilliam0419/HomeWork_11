package hw5;

public class Problem5 {
	public static void main(String[] args) {
//		身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//		請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼
//		，此驗證碼內容包含了英文大小寫與數字的亂數組合
		Problem5 pr5 = new Problem5();
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(pr5.genAuthCode());
	}
	
	public String genAuthCode() {
		// A~Z   unicode 65~90
		// a~z   unicode 97~122
		String randomStr = "";
		for(int i = 1; i <= 8; i++) {
			int getChose = (int)(Math.random()*3);
			switch (getChose) {
				case 0:
					int getNumber = getRandom(0, 9);
					randomStr += String.valueOf(getNumber);
					break;
				case 1:
					char getEnUp = (char)getRandom(65, 90);
					randomStr += String.valueOf(getEnUp);
					break;
				case 2:
					char getEnDown = (char)getRandom(97, 122);
					randomStr += String.valueOf(getEnDown);
					break;
			}
		}
		return randomStr;
	}
	
	public int getRandom(int min, int max) {
		return (int)(Math.random()*(max - min + 1) + min);
	}
}
