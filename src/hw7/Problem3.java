package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem3 {
	public static void main(String[] args) {
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
		
		Problem3 p3 = new Problem3();
		p3.copyFile(new File("C:\\Users\\T14 Gen 3\\Desktop\\JAVA課程\\Homework\\HomeWork7\\Data.txt"), 
					new File("C:\\Users\\T14 Gen 3\\Desktop\\JAVA課程\\Homework\\HomeWork7\\Data2.txt"));
		System.out.println("end");
		
		
	}
	
	public void copyFile(File src, File newFile) {
		if(src.exists()) {
			String ans = "";
			try {
				FileReader fr = new FileReader(src);
				FileWriter fw = new FileWriter(newFile);
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				
				while(!((ans = br.readLine()) == null)) {
					bw.write(ans + "\n");
					bw.flush();
				}
				bw.close();
				br.close();
				fw.close();
				fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("沒有檔案");
		}
	}
}
