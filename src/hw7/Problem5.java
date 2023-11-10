package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Problem5 {
	public static void main(String[] args) {
//		承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法
//		觀察結果如何 (請利用多型簡化本題的程式設計)

		File file = new File("C:\\data\\Object.ser");

		try {
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fi);
			System.out.println("資料讀取如下：" + file.getClass());
			System.out.println("-------------------------------");
			try {
				while (true) {
					((Animal) ois.readObject()).speak();
				}
			} catch (ClassNotFoundException | EOFException e) {
//				e.printStackTrace();
				System.out.println("資料讀取完畢");
			}

			ois.close();
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
