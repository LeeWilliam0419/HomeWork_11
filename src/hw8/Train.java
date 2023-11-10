package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{
//	請設計一個Train類別，並包含以下屬性：
//	- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//	- 目的地 dest，型別為String - 票價 price，型別為double
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}

//	@Override
//	public boolean equals(Object o) {
//		if(o == this) return true;
//		if(o == null || (o.getClass() == this.getClass())) return false;
//		Train train = (Train)o;
//		return this.getNumber() == train.getNumber() && 
//				this.getStart() == train.getStart() &&
//				this.getDest() == train.getDest() &&
//				this.getType() == train.getType() &&
//				this.getPrice() == train.getPrice() &&
//				Objects.equals(number, train.number) &&
//				Objects.equals(start, train.start) &&
//				Objects.equals(dest, train.dest) &&
//				Objects.equals(type, train.type) &&
//				Objects.equals(price, train.price);
//	}

//@Override
//	public int hashCode() {
//		return Objects.hash(dest, number, price, start, type);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int init = 1;
		int result = (int) (init * prime * this.getNumber() * this.getPrice());
		result = result * this.getType().hashCode() * this.getStart().hashCode() * this.getDest().hashCode();

		return result;
	}
	
	@Override
	public int compareTo(Train o) {
		if(this.number < o.number) return 1;
		else if(this.number == o.number && 
				this.start.equals(o.start) &&
				this.dest.equals(o.dest) &&
				this.type.equals(o.type) &&
				this.price == o.price) return 0;
		else return -1;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
