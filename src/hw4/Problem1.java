package hw4;

import java.util.Arrays;

public class Problem1 {
	public static void main(String[] args) {
//		 有個一維陣列如下：
//		 {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		
		Problem1 p1 = new Problem1();
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(array);
		
		System.out.println("陣列所有元素的平均值為：" + p1.avg(array));

		System.out.print("陣列大於平均值的元素為：");
		p1.more(p1.avg(array), array);
		
	}
	
	//所有元素的平均值
	public double avg(int[] array) {
		double sum = 0;
		for(int i =0; i < array.length; i++) {
			 sum += array[i];
		}
		
		return sum/array.length;
	}
	
	//大於平均值的元素
	public void more(double avg, int[] array) {
		int index = Arrays.binarySearch(array,(int)avg);
		if(index > 0){
			for(int i = index + 1; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
		}else {
			index = Math.abs(index + 1);
			for(int i = index; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
