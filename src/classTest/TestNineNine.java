package classTest;

public class TestNineNine {
	//請建立一個TestNineNine.java程式，可輸出九九乘法表
	public static void main(String[] args) {
		// 一：使用for迴圈 + while迴圈
		for(int i = 1; i <= 9; i++) {
			int j = 1;
			while(j <= 9) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println();
		
		// 二：使用for迴圈 + do while迴圈
		for(int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
				j++;
			}while(j <= 9);
			System.out.println();
		}
		System.out.println();
		
//		 三：使用while迴圈 + do while迴圈
		int i = 0;
		while(i++ < 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}while(++j <= 9);
			System.out.println();
		}
	}

}
