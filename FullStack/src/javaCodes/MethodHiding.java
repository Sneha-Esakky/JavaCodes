package javaCodes;

	public class MethodHiding{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Parent p = new Parent();
			p.fun();
			Child c = new Child();
			c.fun();
			
			Parent ref = new Child();//static methods dont need ref variable it will consider it as class
			ref.fun();// Parent fun- ({if the methods were non-static "Child fun" basically upcasting}
			//coz it does not look into type of ref variable get the output
	        //as oops concepts, overriding, upcasting and such concepts cannot be applied to static methods
		}
	//when we try to override static methods its the scenario that oocurs is called method hiding
	}
	  class Parent {
		public static void fun() {
			System.out.println("Parent fun");
		}
	}

	  class Child extends Parent {
		public static void fun() {
			System.out.println("Child fun");
		}
	}
}
