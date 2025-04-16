package javaCodes;

import java.util.Scanner;

public class Nth_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the term n");
       int n= s.nextInt();
       int nthTerm = n*(n+1)/2;
       System.out.println("The "+n+" th term of the series is "+nthTerm);
       s.close();
	}

}
