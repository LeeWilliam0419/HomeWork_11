package hw7;

public class Dog extends Animal {
	private final static long serialVersionUID = 1L;
	
	private String name;
	
	public Dog(String name) {
		super(name);
		this.name = name;
		
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
