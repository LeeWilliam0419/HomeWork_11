package hw2;

public class Problem6 {
	public static void main(String[] args) {
//		for(int i = 10; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		String str = "";
		for(int i = 1; i <= 10; i++) {
			str += i + " ";
		}
		System.out.println(str);
		for(int i = 10; i >= 1; i--) {
			str = str.trim();
			str = str.replace(String.valueOf(i), "");
			System.out.println(str);
		}
	}
}
