package hw4;

import java.util.Arrays;

public class Problem6 {
	
	public static void main(String[] args) {
		//請算出每位同學考最高分的次數
		int[][] score = {{10, 35, 40, 100, 90, 85, 75, 70},
					 	 {37, 75, 77, 89, 64, 75, 70, 95},
					 	 {100, 70, 79, 90, 75, 70, 79, 90},
					 	 {77, 95, 70, 89, 60, 75, 85, 89},
					 	 {98, 70, 89, 90, 75, 90, 89, 90},
					 	 {90, 80, 100, 75, 50, 20, 99, 75}};
		int[] hight = new int[8];
		
		
		for(int i = 0; i < score.length; i++) {
			int hightScore = Arrays.stream(score[i]).max().getAsInt();
			for(int j = 0; j < score[i].length; j++) {
				if(hightScore == score[i][j]) {
					hight[j] += 1;
				}
			}
		}
		//顯示每位同學考最高分的次數
		for(int i = 0; i < hight.length; i++) {
			System.out.println(i+1 + "號同學考了" + hight[i] + "次最高分數！");
		}
	}
}
