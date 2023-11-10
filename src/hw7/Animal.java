package hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable{
	private final static long serialVersionUID = 1L;
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void speak() ;
}
