package hw2;

//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
public class Problem4 {
	public static void main(String[] args) {
		int i = 1, pow;
		while(i <= 10) {
			pow = (int)Math.pow(i++, 2);
			System.out.print(pow + " ");
		}
	}
}
