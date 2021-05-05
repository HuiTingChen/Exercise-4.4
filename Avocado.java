package FRUITS;

public class Avocado extends Fruit {
	private String type;
	private double fats;
	private double weight;
	private boolean heart_healthy;
	
	public Avocado(String n, String t, double f, double w, boolean h){ //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		type = t;
		fats = f;
		weight = w;
		heart_healthy = h;
		
		if (this.type.equals("Florida")) {
			double ff = 0.153;
			System.out.println("The " + this.type + " avocado's fats amount for " + weight + "g is " + totalFats(ff) + ".");
		}
		else if (this.type.equals("Hass")) {
			double ff = 0.195;
			double times = 1.18;
			System.out.println("The " + this.type + " avocado's fats amount for " + weight + "g is " + totalFats(ff,times) + ".");
		}
		else 
			System.out.println("The " + this.type + " avocado's fats amount for " + weight + "g is " + totalFats() + ".");
		
	}
	
	public String getType() {
		return type;
	}
	
	public double getFats() {
		return fats;
	}
	  
	public double getWeight() {
		return weight;
	}
	
	public boolean getCompare() {
		return heart_healthy;
	}
	
	public double totalFats() {
		return fats * weight;
	}
	
	public double totalFats(double ff) {
		return fats * weight;
	}
	
	public double totalFats(double ff,double times ) {
		return fats * weight * times;
	}
	
	public String toString() { //overriding method
		return super.toString() + 
			   "\nIs avocado contain heart healthy fatty acid? " + heart_healthy ;
		  	   
	}
}
