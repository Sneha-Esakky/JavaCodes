package javaCodes;

public class Overriden {
   public static void main(String[] args) {
	   System.out.println("Accessing Developer");
	   Developer d = new Developer();
	   d.task();//inherited method
	   d.goal();//overidden method
	   d.code();//child-specific method
	   System.out.println("\nAccessing Test Engineer");
	   TestEngineer te = new TestEngineer();
	   te.task();
	   te.goal();
	   te.test();	
}
}

class SoftwareEngineer {
	public void task() { //inherited method as its not overriden and present only in parent class
		System.out.println("Do work on time.");
	}
	public void goal() {
		System.out.println("Deal wth software");
	}
}

class Developer extends SoftwareEngineer {
	public void goal() {
		System.out.println("Deal with Software Development");
	}
	public void code() {
		System.out.println("Developers love to code");
	}
}

class TestEngineer extends SoftwareEngineer {
	public void goal() {    //overriden method
		System.out.println("Deal with Software Testing");
	}
	public void test() {//child specific method
		System.out.println("Test Engineers love testing the code");
	}
}

