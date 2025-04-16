package javaCodes;

public class Upcasting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.fun();
		Child c = new Child();
		c.fun();
		
		Parent ref = new Child();
		ref.fun();//child fun
	}
//when we try to override static methods its the scenario that oocurs is called method hiding
}
  class Parent {
	public void fun() {
		System.out.println("Parent fun");
	}
}

  
  class Child extends Parent {
	public void fun() {
		System.out.println("Child fun");
	}
}