package hw9;

public class Challenger implements Runnable{
	String name;
	Thread t;
	Challenger(String name){
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + "吃第" + i + "碗飯");
			try {
				Thread.sleep(eatTime(500, 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");
	}
	
	public int eatTime(int min, int max) {
		return (int)(Math.random()*(max - min + 1)) + min;
	}
}
