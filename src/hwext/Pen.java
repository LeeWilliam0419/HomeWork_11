package hwext;

public abstract class Pen {
	private String brand;
	private double price;
	
	Pen(){
		
	}
	
	Pen(String brand, double price){
		setBrand(brand);
		setPrice(price);
	}
	
	public abstract void write();
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
