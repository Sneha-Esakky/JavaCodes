package javaCodes;

public class Composition {
	    public static void main(String[] args) {
	     
	        Laptop l = new Laptop();
	        l.brand = "Dell";
	        l.price = 35000;
	        l.accessData();  
	        
	        l = null;
	        l.accessData();
	    }
	}
	class Laptop {
	 String brand;
	 int price;
	 
	 Data d = new Data();
	 
	 public void accessData() {
	  d.value = "ICC Champions = India";
	  System.out.println("Accesing data with laptop: " + d.value);
	  System.out.println("Laptop brand: " + brand);
	  System.out.println("Laptop price: " + price);
	 }
	}
	class Data {
	 String value;
	}
}
