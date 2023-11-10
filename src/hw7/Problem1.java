package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
	public static void main(String[] args) {
//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		
		File getFile = new File("C:\\Users\\T14 Gen 3\\Desktop\\JAVA課程\\Homework\\HomeWork7\\Sample.txt");
		try {
			FileInputStream is = new FileInputStream(getFile);
			BufferedInputStream bi = new BufferedInputStream(is);
			InputStreamReader isr = new InputStreamReader(bi);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Sample.txt檔案共有：\n" + bi.available() + "位元組");
			int count = 0;
			int charCount = 0;
			String ans = "";
			while(!((ans = br.readLine()) == null)) {
				charCount += ans.length();
				count++;
			}
			System.out.println(charCount + "個字元");
			System.out.println(count + "列資料");
			br.close();
			isr.close();
			bi.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
