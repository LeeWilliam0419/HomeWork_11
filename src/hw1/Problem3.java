package hw1;

public class Problem3 {
	public static void main(String[] args) {
		int total = 256559;
		int sec = total % 60;
		int min = total / 60 % 60;
		int hr = total / 3600 % 24;
		int day = total /(3600*24);
		System.out.println("256559秒為" + day + "天，" + hr + "時，" + min + "分，" + sec + "秒");
	}

}
