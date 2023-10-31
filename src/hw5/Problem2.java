package hw5;

public class Problem2 {
	public static void main(String[] args) {
//		請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中
//		取平均值並印出這10個亂數與平均值
		Problem2 pr = new Problem2();
		pr.randAvg();
		
	}
	
	public void randAvg() {
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 101);
			System.out.print(random + " ");
			sum += random;
		}
		double avg = sum / 10;
		System.out.println();
		System.out.printf("%.2f" , avg);
	}
}
