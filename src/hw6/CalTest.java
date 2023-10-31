package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("請輸入x的值：");
				int x = sc.nextInt();
				System.out.print("請輸入y的值：");
				int y = sc.nextInt();
				Calculator cal = new Calculator(x, y);
				System.out.println(x + "的" + y + "次方等於" + cal.powerXY());
				sc.close();
				break;
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確！");
			} catch (CalException c) {
				System.out.println(c.getMessage());
			}

		}
	}

}
