package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem1 {
	public static void main(String[] args) {
//		請建立一個Collection物件並將以下資料加入：
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
//		印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//		移除不是java.lang.Number相關的物件
//		再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

		Problem1 p1 = new Problem1();
		List<Object> list = p1.data(new ArrayList<Object>());

		System.out.println("---------------Iterator------------------");
		p1.iteratorAll(((ArrayList<Object>) list).iterator());
		System.out.println();

		System.out.println("-----------foreach-------------");
		p1.foreachAll(list);
		System.out.println();

		System.out.println("-----------for迴圈-------------");
		p1.forAll(list);
		System.out.println();
		
		p1.removeNoNum(list);

		System.out.println("-------Iterator移除非Number相關的物件--------");
		p1.iteratorAll(((ArrayList<Object>) list).iterator());
		System.out.println();

		System.out.println("---------foreach移除非Number相關的物件---------");
		p1.foreachAll(list);
		System.out.println();

		System.out.println("---------for迴圈移除非Number相關的物件---------");
		p1.forAll(list);
		System.out.println();
	}

	// 使用Iterator印出所有元素
	public void iteratorAll(Iterator<Object> ir) {
		while (ir.hasNext()) {
			System.out.print(ir.next() + ", ");
		}
	}

//	使用foreach印出所有元素
	public void foreachAll(List<Object> list) {
		for (Object o : list) {
			System.out.print(o + ", ");
		}
	}
	
//	使用for迴圈印出所有元素
	public void forAll(List<Object> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
	}

	//移除非Number相關的物件
	public void removeNoNum(List<Object> list) {
		Iterator<Object> ir = list.iterator();
		while(ir.hasNext()) {
			if(!(ir.next() instanceof Number)) {
				ir.remove();
			}
		}
	}
	
	//collection資料
	public List<Object> data(List<Object> collection) {
		collection.add(new Integer(100));
		collection.add(new Double(3.14));
		collection.add(new Long(21L));
		collection.add(new Short("100"));
		collection.add(new Double(5.1));
		collection.add("Kitty");
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));

		return collection;
	}
}
