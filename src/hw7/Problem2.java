package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem2 {
	public static void main(String[] args) {
//		 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//				 append功能讓每次執行結果都能被保存起來)
		
		
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\T14 Gen 3\\Desktop\\JAVA課程\\Homework\\HomeWork7\\Data.txt", true);
			BufferedWriter bw = new BufferedWriter(file);
			PrintWriter pw = new PrintWriter(bw);
			for(int i = 0; i < 10; i++) {
				int random = (int)(Math.random() * 1000) + 1;
				System.out.println(random);
				pw.append(random + " ");
			}			
			pw.append("\n");
			pw.flush();
			pw.close();
			bw.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
}
