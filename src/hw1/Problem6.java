package hw1;

public class Problem6 {
	public static void main(String[] args) {
		System.out.println((int)'5');
		System.out.println(5 + 5);    //型別為預設 int + int 的型別，所以為數字的5 + 5 = 10
		System.out.println(5 + '5'); //型別為 int + char 的型別，char型別會轉換成int型別，'5'對應到Unicode碼為0020+15=0035，將16進位轉成10進位0035就變成3*16+5=53，最後5 + 53 = 58
		System.out.println(5 + "5");  //型別為 int + String 的型別，會將int轉成String型別，成為String + String的字串串接，所以變成"5" + "5" = "55"
	}

}
