package hw6;

public class Calculator {
	private int x;
	private int y;
	
	public Calculator(int x, int y) throws CalException{
		if(x == 0 && y == 0) {
			throw new CalException("0與0的次方沒有意義！");
		}
		setX(x);
		setY(y);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) throws CalException{
		if(y < 0)
			throw new CalException("次方為負值，結果回傳不為整數！");
		this.y = y;
	}
	
	public double powerXY() {
		return Math.pow(x, y);
	}
}
