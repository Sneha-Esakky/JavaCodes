package numberseries;

import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter the integer value");
     int n=s.nextInt();
     while (n>0)
     {
    	 int res=n%10;
    	 System.out.println(res);
    	 n=n/10;
	}
     
	}

}
