package numberseries;

import java.util.Scanner;

public class C17 {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter a value");
    int a = s.nextInt();
    System.out.println("enter b value");
    int b= s.nextInt();
    System.out.println("before swapping");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swapping");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
	}

}
