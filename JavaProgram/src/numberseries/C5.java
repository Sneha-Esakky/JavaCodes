package numberseries;

import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter an integer value");
     int n=s.nextInt();
     int count=0;
     while (n>0) {
    	 int r=n/10;
    	 count++;
     }
     
     System.out.println(count);
		
	}
}

  