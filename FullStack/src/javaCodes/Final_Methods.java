package javaCodes;

class Parent1 {
	final void show() {
		System.out.println("This is the final method from parent class");
	}
}
 class Child1 extends Parent {
	 
     System.out.print("Child class.");
 }


public class Final_Methods {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}
}
