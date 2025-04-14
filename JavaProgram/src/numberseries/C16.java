package numberseries;

import java.util.Scanner;

public class C16 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter a value");
     int a =s.nextInt();
     System.out.println("enter b value");
     int b=s.nextInt();
     System.out.println("before Swapping");
     System.out.println("a:"+a);
     System.out.println("b:"+b);
     int temp=a;
     a=b;
     b=temp;
     System.out.println("after Swapping");
     System.out.println("a:"+a);
     System.out.println("b:"+b);
     
	}

}
