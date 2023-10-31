package hw5;

import java.util.Arrays;

public class Problem3 {
	public static void main(String[] args) {
//		 利用Overloading，設計兩個方法int maxElement(int x[][])與
//		 double maxElement(double x[][])，可以找出二維陣列的最大值並回傳
		
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		
		Problem3 pr3 = new Problem3();
		System.out.println("int陣列最大值為：" + pr3.maxElement(intArray));
		System.out.println("double陣列最大值為：" + pr3.maxElement(doubleArray));
	}

	public int maxElement(int x[][]) {
		int[] everyMax = new int[x.length];
		for (int i = 0; i < x.length; i++)
			everyMax[i] = Arrays.stream(x[i]).max().getAsInt();
		return Arrays.stream(everyMax).max().getAsInt();
	}

	public double maxElement(double x[][]) {
		double[] everyMax = new double[x.length];
		for (int i = 0; i < x.length; i++)
			everyMax[i] = Arrays.stream(x[i]).max().getAsDouble();
		return Arrays.stream(everyMax).max().getAsDouble();
	}
}
