package FRUITS;

public class Main {
    public static void main(String[] args) {
		
		//Fruit objFruit = new Fruit("Fruit"); universal
		//System.out.println(objFruit);
		
		//System.out.println();
    	System.out.println("______________________Apple______________________");
		Apple objApple = new Apple("Apple", 105,2, "red & green", "sweet");	
		System.out.println(objApple.toString());
		
		System.out.println();
		System.out.println("___________________Green Apple___________________");
		GreenApple objGApple = new GreenApple("Granny Smith", 8,0.7,"green","sour", true);	
		System.out.println(objGApple.toString());
	
		System.out.println();
		System.out.println("____________________Red Apple____________________");
		RedApple objRApple = new RedApple("Fuji", 80,1.59,"red","sweet", true);	
		System.out.println(objRApple.toString());
		
		System.out.println();
		System.out.println("______________________Lemon______________________");
		Lemon objLemon = new Lemon("Lemon", 0.53, 28,"peel", true);
		System.out.println(objLemon.toString());
		
		System.out.println();
		System.out.println("_____________________Avocado_____________________");
		Avocado objAvocado = new Avocado("Avocado","Hass", 0.15, 90, true);
		System.out.println(objAvocado.toString());

		
	}
}