package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Problem4 {
	public static void main(String[] args) {
//		 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		 意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
		String path = "C:\\data\\Object.ser";
		File filePath = new File(path.substring(0, path.lastIndexOf("\\")));
		if(!(filePath.exists())) {
			filePath.mkdir();
		}
		
		Animal[] animal = new Animal[4];
		animal[0] = new Cat("小紅");
		animal[1] = new Cat("小黃");
		animal[2] = new Dog("小粉");
		animal[3] = new Dog("小藍");
		
		File file = new File(filePath, path.substring(path.lastIndexOf("\\") + 1));
		
		try {
			FileOutputStream fi = new FileOutputStream(file);	
			ObjectOutputStream ois = new ObjectOutputStream(fi);
			for(int i = 0; i < animal.length; i++) {
				ois.writeObject(animal[i]);
			}
			ois.flush();
			ois.close();
			fi.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("完成！");
	}
}
