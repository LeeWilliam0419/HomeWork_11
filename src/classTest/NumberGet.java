package classTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberGet {
	public static void main(String[] args) {
		Set setNum = new HashSet();
		while(setNum.size() < 6) {
			int number = (int)(Math.random() * 49 + 1);
			setNum.add(number);
		}
//		System.out.println(setNum);
		Iterator it = setNum.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
