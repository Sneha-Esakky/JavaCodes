package javaCodes;

public class Main {
	static int a=10;
	static int b;
	
	static {
		System.out.println("Static block 1 executing");	
	}
	
	static {
		System.out.println("Static block 2 executed");
	}
	
	public static void fun() {
		System.out.println("Static method executing");
		System.out.println(a);
		System.out.println(b);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() executing");
		Main.fun();
	}
	
	static {
		System.out.println("Static block 3 at the end.");
	}
	

}
