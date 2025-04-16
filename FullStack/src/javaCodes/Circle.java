package javaCodes;

public class Circle {
	
	double radius;
	double pi = 3.14;
	
	public void findArea() {
		System.out.println("Area:"+pi * (radius *radius)); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle c = new Circle();
     c.radius=12;
     c.findArea();
     
     c.radius=15.6;
     c.findArea();

	}

}
