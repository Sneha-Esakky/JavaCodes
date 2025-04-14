package numberseries;

import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter an integer value");
     int n=s.nextInt();
     int sum=0;
     while (n>0) 
     {
    	 int res=n%10;
    	 sum=sum+res;
    	 n=n/10;
	}
     System.out.println(sum);
     
	}

}
