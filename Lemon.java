package FRUITS;

public class Lemon extends Fruit {
	private double vitaminC;
	private double weight;
	private String form;
	private boolean compare;
	
	public Lemon(String n, double vitC, double w, String f, boolean c) { //constructor with  argument	
		super(n);// inherit data from super class with 1 parameter
		vitaminC = vitC;
		weight = w;
		form = f;
		compare = c;
		
		if (form.equals("juice")) {
			double vC = 0.053;
			System.out.println("The vitamin c content in " + weight + "g lemon " + form + " is " + totalvitC(vC));
		}
		else if (form.equals("peel")) {
			double vC = 0.043;
			double times = 3;
			System.out.println("The vitamin c content in " + weight + "g lemon " + form + " is " + totalvitC(vC,times));
		}
		else 
			System.out.println("The vitamin c content in " + weight + "g lemon " + form + " is " + totalvitC());
	}
	
	public double getvitaminC() {
		return vitaminC;
    }
  
    public double getWeight() {
		return weight;
    }
	
    public double totalvitC() {
	    return vitaminC * weight;
    }
    
    public double totalvitC(double vC) {
  	    return vC * weight;
    }
    
    public double totalvitC(double vC,double times) {
  	    return vC * weight * times;
    }
    
    public String getForm() {
		return form;
    }
  
    public boolean getCompare() {
		return compare;
    }
    
    public String toString() { //overriding method
		return super.toString() + 
			   "\n\"Is lemon peel has higher vitamin C? " + compare;
	}
}
