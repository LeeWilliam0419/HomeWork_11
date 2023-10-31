package hwext;

public class InkBrush extends Pen{
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
}
