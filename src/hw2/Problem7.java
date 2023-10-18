package hw2;

public class Problem7 {
	public static void main(String[] args) {
		for (int i = 65; i <= 70; i++) {
			for (int j = 1; j <= i - 64; j++) {
				System.out.print((char) i);
			}
			System.out.println();
		}

	}
}
