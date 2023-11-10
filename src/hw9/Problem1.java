package hw9;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println("------大胃王快食比賽開始!------");
		Challenger challenger1 = new Challenger("饅頭人");
		Challenger challenger2 = new Challenger("詹姆士");
		
		try {
			challenger1.t.join();
			challenger2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("------大胃王快食比賽結束!------");
	}
}
