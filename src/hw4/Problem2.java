package hw4;

public class Problem2 {
	public static void main(String[] args) {
//		 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		 例如String s = “Hello World”，執行結果即為dlroW olleH
		
		System.out.print(new StringBuilder("Hello World").reverse().toString());
	}
}
