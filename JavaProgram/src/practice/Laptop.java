package practice;

public class Laptop {
 int id;
 double price;
 String brand;
 
public Laptop(int id, double price, String brand) {
	super();
	this.id = id;
	this.price = price;
	this.brand = brand;
}

@Override
public String toString() {
	return "Laptop [id=" + id + ", price=" + price + ", brand=" + brand + "]";
}
   
	}


