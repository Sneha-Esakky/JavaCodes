package numberseries;

import java.util.Scanner;

public class C21 {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter n value");
    int n= s.nextInt();
    int i=0;
    int count=0;
    for(i=1;i<n/2;i++)
    {
    	if(i*i==n)
    	{
    		count++;
    		break;
    	}
    }
    if(count==1)
    {
    	System.out.println(i+" is Squareroot of "+n);
    }
    else
    {
    	System.out.println(n+" is not a Perfect Square");
    }
	}

}
