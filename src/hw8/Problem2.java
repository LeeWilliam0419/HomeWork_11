package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem2 {
	public static void main(String[] args) {
		Problem2 p2 = new Problem2();
		
		//請寫一隻程式，能印出不重複的Train物件
		Set<Train> list = (HashSet<Train>)p2.data(new HashSet<Train>());
		System.out.println("-------使用for迴圈-------");
		p2.forAll(list);
		System.out.println("--------使用foreach-------");
		p2.foreachAll(list);
		System.out.println("--------使用Iterator-------");
		p2.iteratorAll(list.iterator());
		
		//請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		List<Train> sortList = (ArrayList<Train>)p2.data(new ArrayList<Train>());
//		Collections.sort(sortList);
		sortList.sort(null);
		System.out.println("-------使用for迴圈-------");
		p2.forAll(sortList);
		System.out.println("--------使用foreach-------");
		p2.foreachAll(sortList);
		System.out.println("--------使用Iterator-------");
		p2.iteratorAll(sortList.iterator());
		
		

//		//承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		TreeSet<Train> sortSet = new TreeSet<Train>(p2.data(new TreeSet<Train>()));
		System.out.println("-------使用for迴圈-------");
		p2.forAll(sortSet);
		System.out.println("--------使用foreach-------");
		p2.foreachAll(sortSet);
		System.out.println("--------使用Iterator-------");
		p2.iteratorAll(sortSet.iterator());
	}
	
	// 使用Iterator印出所有元素
	public void iteratorAll(Iterator<Train> ir) {
		Train temp;
		while (ir.hasNext()) {
			temp = ir.next();
			System.out.print(temp.getNumber() + " " +
					 temp.getType() + " " +
					 temp.getStart() + " " + 
					 temp.getDest() + " " +
					 temp.getPrice() + "\n");
		}
	}

//	使用foreach印出所有元素
	public void foreachAll(Collection<Train> list) {
		for (Train t : list) {
			System.out.print(t.getNumber() + " " +
							 t.getType() + " " +
							 t.getStart() + " " + 
							 t.getDest() + " " +
							 t.getPrice() + "\n");
		}
	}
	
//	使用for迴圈印出所有元素
	public void forAll(Collection<Train> list) {
//		Train[] temp = (Train[])(list.toArray());
		for (int i = 0; i < list.size(); i++) {
			Train temp = (Train)(list.toArray()[i]);
			System.out.print(temp.getNumber() + " " +
					 temp.getType() + " " +
					 temp.getStart() + " " + 
					 temp.getDest() + " " +
					 temp.getPrice() + "\n");
		}
	}
	//火車資料
	public Collection<Train> data(Collection<Train> train) {
		Collection<Train> datas  = train;
		datas.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		datas.add(new Train(1254, "區間", "屏東", "基隆", 700));
		datas.add(new Train(118, "自強", "高雄", "台北", 500));
		datas.add(new Train(1288, "區間", "新竹", "基隆", 400));
		datas.add(new Train(122, "自強", "台中", "花蓮", 600));
		datas.add(new Train(1222, "區間", "樹林", "七堵", 300));
		datas.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		return datas;
	}
}
