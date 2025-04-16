package javaCodes;

public class Relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Charger c = new Charger();
    c.type = "c-type";
   
	}

}

class Laptop {
	String brand ;
	int price;
	Charger c;
	 public void hasCharger(Charger obj) {
	    	c = obj;
	    	System.out.println("Accesing the charger with laptop" + c.type);
	    	System.out.println("Laptop brand: " + brand);
	    	System.out.println("Laptop price: " + price);
	    }
}