package FRUITS;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	protected String colour;
	protected String taste;
	
	public Apple(String n, int q, double p, String clr, String t) { //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		quantity = q;
		price = p;
	    colour = clr;
		taste = t;
		
		if (this.quantity < 10) {
			total(); //overloading with no arguments sbb harga dan kuantiti sama/tak berubah
			System.out.println("If purchased quantity LESS than 10, Total price: RM" + total());
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = p-0.05; // purchase more than 10 but less than 100, price will deduct 0.05
			total(pp); //overloading with 1 argument
			System.out.println("If purchased quantity MORE than 10, Total price: RM" + total(pp));
		}
		
			else {
			double pp = p-0.10; //purchase more than 100 , price will deduct 0.10
			double dis = 0.1; //purchase more than 100 , discount 10%
			total(dis, pp); //overloading with 2 arguments
			System.out.println("If purchased quantity MORE than 100, Total price: RM" + total(dis,pp));
		}
	}
	
	public int getQuantity() {
		return quantity;
    }
	
	public double getPrice() {
		return price;
    }
	  
	public String getColour() {
		return colour;
    }
	
	public String getTaste() {
		return taste;
    }
	  
	public double total() {
		return quantity* price;
	} 
	
	public double total(double pp) {
		return quantity* pp;
	} 
	
	public double total(double dis, double pp) {
		return quantity* pp * (1-dis);
	} 
	
	public String toString() { //overriding method
	    return  super.toString() + 
	    		"\nColour             : " + colour + "\n" + 
	    		"Taste              : " + taste;
	}
	
}