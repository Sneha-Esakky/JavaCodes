package numberseries;

import java.util.Scanner;

public class C15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter an integer value");
		int n= s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int res=n%10;
			int fact=1;
			for(int i=1;i<=res;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			}
	  if(sum==temp)
	   System.out.println(temp+" is a Strong number");
	  else
		  System.out.println( temp + " is not a Strong number");
	}
	

	}


