package hw3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Problem3 {
	public static void main(String[] args) {
		
		Problem3 pro = new Problem3();
		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sr = new Scanner(System.in);
		int hateNumber = sr.nextInt();
		List<Integer> randomNum = new ArrayList<Integer>();
		
		System.out.println("可以選擇的數字有：");
		int[] ans = pro.selectNum(pro.countNum(hateNumber), hateNumber);
		
		for(int i =0; i < ans.length; i++) {
			int random = (int)(Math.random() * pro.countNum(hateNumber));
			if(randomNum.contains(ans[random])) {
				i--;
			}else {
				randomNum.add(ans[random]);
			}
		}
		System.out.println("======");
		System.out.print(randomNum.toArray());
//		for(int i = 1; i < 50; i++) {
//			if(i % 10 == hateNumber || i / 10 == hateNumber)
//				continue;
//			else
//				total++;
//				System.out.print(i + " ");
//		}
		
//		System.out.println();
//		System.out.print("總共有：" +total + "個");
		
		sr.close();
	}
	
	
	
	public int[] selectNum(int count, int hateNumber) {
		int total = 0;
		int[] select = new int[count];
		for(int i = 1; i < 50; i++) {
			if(i % 10 == hateNumber || i / 10 == hateNumber)
				continue;
			else {
				select[total] = i;
				total++;
			}
				System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("總共有：" +total + "個");
		
		return select;
	}
	
	
	public int countNum(int hateNumber) {
		int total = 0;
		for(int i = 1; i < 50; i++) {
			if(i % 10 == hateNumber || i / 10 == hateNumber)
				continue;
			else {
				total++;
			}
		}
		return total;
	}

}
