package numberseries;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter an integer value");
	int n=s.nextInt();
	int prod=1;
	while(n>0)
	{
		int rem = n%10;
		prod=prod*rem;
		n=n/10;
		
	}
    System.out.println(prod);
	}

}
