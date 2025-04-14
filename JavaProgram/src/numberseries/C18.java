package numberseries;

import java.util.Scanner;

public class C18 {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter a integer value");
    int n= s.nextInt();
    int count=0;
    for(int i=2;i<n;i++)
    {
    	if(n%i==0)
    	{ count++;
    	  break;
    	}
    }
    if(count==0&&n!=1)
    {
    	System.out.println(n+" is a prime number");
    }
    else
    {
    	System.out.println(n+" is not a a prime number");
    }
   
	}

}
