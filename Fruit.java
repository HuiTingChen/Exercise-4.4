package FRUITS;

public class Fruit {
	protected String name;
	
	public Fruit(String n) { //constructor with 1 argument	
		name = n;
	}
	
	public String getName() {
		return name;
	}	
	
	public String toString() { //overriding method
		return "Fruit Name         : " + name ; 
	}
}
